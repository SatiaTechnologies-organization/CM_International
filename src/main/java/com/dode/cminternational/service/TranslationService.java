package com.dode.cminternational.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class TranslationService {

    public String translateEnToDe(String text) {
        if (text == null || text.trim().isEmpty()) return text;

        String[] sentences = text.split("(?<=[.!?])\\s+");
        StringBuilder fullTranslation = new StringBuilder();
        StringBuilder chunk = new StringBuilder();

        for (String sentence : sentences) {
            if (chunk.length() + sentence.length() > 450) {
                fullTranslation.append(translateChunk(chunk.toString())).append(" ");
                chunk = new StringBuilder();
            }
            chunk.append(sentence).append(" ");
        }
        if (!chunk.isEmpty()) {
            fullTranslation.append(translateChunk(chunk.toString()));
        }

        return fullTranslation.toString().trim();
    }

    private String translateChunk(String text) {
        try {
            String encodedText = URLEncoder.encode(text, StandardCharsets.UTF_8);
            URL url = new URL("https://api.mymemory.translated.net/get?q=" + encodedText + "&langpair=en|de");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000); // 5 seconds timeout
            conn.setReadTimeout(5000);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String json = response.toString();
            String searchStr = "\"translatedText\":\"";
            int startIndex = json.indexOf(searchStr);

            if (startIndex != -1) {
                startIndex += searchStr.length();
                int endIndex = json.indexOf("\"", startIndex);
                if (endIndex != -1) {
                    String translated = json.substring(startIndex, endIndex);
                    if (translated.contains("MYMEMORY WARNING")) {
                        return text;
                    }
                    return translated;
                }
            }
            return text;
        } catch (Exception e) {
            return text; 
        }
    }
}