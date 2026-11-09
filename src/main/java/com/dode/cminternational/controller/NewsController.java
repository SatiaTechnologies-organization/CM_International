package com.dode.cminternational.controller;

import com.dode.cminternational.model.NewsPost;
import com.dode.cminternational.repository.NewsPostRepository;
import com.dode.cminternational.service.FileUploadService;
import com.dode.cminternational.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class NewsController {

    @Autowired
    private NewsPostRepository newsRepo;

    @Autowired
    private TranslationService translationService;

    @Autowired
    private FileUploadService fileUploadService;
    @GetMapping("/news")
    public String showNews(Model model) {
        model.addAttribute("newsList", newsRepo.findAll(Sort.by("id").descending()));
        return "news";
    }
    @GetMapping("/admin/news")
    public String adminNewsDashboard(Model model) {
        model.addAttribute("newsList", newsRepo.findAll(Sort.by("id").descending()));
        return "admin/admin-news-dashboard";
    }
    @GetMapping("/admin/news/new")
    public String showNewsCreateForm(Model model) {
        model.addAttribute("newsPost", new NewsPost());
        return "admin/admin-news-form";
    }
    @PostMapping("/admin/news/save")
    public String saveNewsPost(@ModelAttribute NewsPost newsPost,
                               @RequestParam(value = "imageFile", required = false) MultipartFile imageFile) {
        if (imageFile != null && !imageFile.isEmpty()) {
            String imagePath = fileUploadService.saveImage(imageFile);
            if (imagePath != null) {
                newsPost.setImageUrl(imagePath);
            }
        }
        if (newsPost.getTitleDe() == null || newsPost.getTitleDe().isEmpty()) {
            newsPost.setTitleDe(translationService.translateEnToDe(newsPost.getTitleEn()));
        }
        if (newsPost.getContentDe() == null || newsPost.getContentDe().isEmpty()) {
            newsPost.setContentDe(translationService.translateEnToDe(newsPost.getContentEn()));
        }
        if ((newsPost.getQuoteDe() == null || newsPost.getQuoteDe().isEmpty()) && newsPost.getQuoteEn() != null) {
            newsPost.setQuoteDe(translationService.translateEnToDe(newsPost.getQuoteEn()));
        }
        newsRepo.save(newsPost);
        return "redirect:/news";
    }
    @GetMapping("/admin/news/delete/{id}")
    public String deleteNewsPost(@PathVariable Long id) {
        newsRepo.deleteById(id);
        return "redirect:/admin/news";
    }
}