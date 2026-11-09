package com.dode.cminternational.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileUploadService {
    private final String UPLOAD_DIR = "uploads/";

    public String saveImage(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return null;
        }
        try {
            File directory = new File(UPLOAD_DIR);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            String originalName = file.getOriginalFilename();
            String uniqueName = UUID.randomUUID().toString() + "_" + (originalName != null ? originalName.replaceAll(" ", "_") : "image.jpg");
            Path path = Paths.get(UPLOAD_DIR + uniqueName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            return "/uploads/" + uniqueName;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}