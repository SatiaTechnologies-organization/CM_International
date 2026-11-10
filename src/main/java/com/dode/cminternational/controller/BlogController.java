package com.dode.cminternational.controller;

import com.dode.cminternational.model.BlogPost;
import com.dode.cminternational.repository.BlogPostRepository;
import com.dode.cminternational.service.FileUploadService;
import com.dode.cminternational.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Controller
public class BlogController {

    @Autowired
    private BlogPostRepository blogRepo;
    @Autowired
    private TranslationService translationService;
    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("/blog")
    public String showBlog(@RequestParam(defaultValue = "0") int page, Model model) {
        Page<BlogPost> blogPage = blogRepo.findAll(PageRequest.of(page, 6, Sort.by("dateCreated").descending()));
        model.addAttribute("blogPage", blogPage);
        return "blog";
    }

    @GetMapping("/blog/post/{id}")
    public String showBlogPost(@PathVariable Long id, Model model) {
        BlogPost post = blogRepo.findById(id).orElse(null);
        if (post == null) return "redirect:/blog";

        post.setViews(post.getViews() + 1);
        blogRepo.save(post);

        model.addAttribute("post", post);
        return "blog-post";
    }

    // --- AJAX ENDPOINT FOR LIKES ---
    @GetMapping("/blog/post/like/{id}")
    @ResponseBody
    public String likePost(@PathVariable Long id) {
        BlogPost post = blogRepo.findById(id).orElse(null);
        if (post != null) {
            post.setLikes(post.getLikes() + 1);
            blogRepo.save(post);
            return String.valueOf(post.getLikes());
        }
        return "0";
    }

    @GetMapping("/admin/blog")
    public String adminBlogDashboard(Model model) {
        model.addAttribute("posts", blogRepo.findAll(Sort.by("dateCreated").descending()));
        return "admin/admin-blog-dashboard";
    }

    @GetMapping("/admin/blog/new")
    public String showBlogCreateForm(Model model) {
        model.addAttribute("post", new BlogPost());
        return "admin/admin-blog-form";
    }

    @PostMapping("/admin/blog/save")
    public String saveBlogPost(@ModelAttribute BlogPost post,
                               @RequestParam(value = "imageFiles", required = false) MultipartFile[] imageFiles,
                               @RequestParam(value = "imageDescriptions", required = false) String[] imageDescriptions) {

        if (post.getDateCreated() == null) post.setDateCreated(LocalDate.now());

        if (post.getTitleDe() == null || post.getTitleDe().isEmpty()) post.setTitleDe(translationService.translateEnToDe(post.getTitleEn()));
        if (post.getCategoryDe() == null || post.getCategoryDe().isEmpty()) post.setCategoryDe(translationService.translateEnToDe(post.getCategoryEn()));
        if (post.getContentDe() == null || post.getContentDe().isEmpty()) post.setContentDe(translationService.translateEnToDe(post.getContentEn()));

        if (imageFiles != null && imageFiles.length > 0) {
            for (int i = 0; i < imageFiles.length; i++) {
                if (!imageFiles[i].isEmpty()) {
                    String path = fileUploadService.saveImage(imageFiles[i]);
                    com.dode.cminternational.model.BlogImage blogImage = new com.dode.cminternational.model.BlogImage();
                    blogImage.setImageUrl(path);
                    String descEn = (imageDescriptions != null && i < imageDescriptions.length) ? imageDescriptions[i] : "";
                    blogImage.setDescriptionEn(descEn);
                    blogImage.setDescriptionDe(translationService.translateEnToDe(descEn));
                    blogImage.setBlogPost(post);
                    post.getImages().add(blogImage);
                }
            }
        }

        blogRepo.save(post);
        return "redirect:/admin/blog";
    }

    @GetMapping("/admin/blog/delete/{id}")
    public String deleteBlogPost(@PathVariable Long id) {
        blogRepo.deleteById(id);
        return "redirect:/admin/blog";
    }
}