package com.dode.cminternational.model;

import jakarta.persistence.*;

@Entity
@Table(name = "news_posts")
public class NewsPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titleEn;
    private String titleDe;
    private String dateText;

    @Column(columnDefinition = "TEXT")
    private String contentEn;
    @Column(columnDefinition = "TEXT")
    private String contentDe;

    @Column(columnDefinition = "TEXT")
    private String quoteEn;
    @Column(columnDefinition = "TEXT")
    private String quoteDe;

    private String imageUrl;
    private String pdfUrl;

    // Getters and Setters...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitleEn() { return titleEn; }
    public void setTitleEn(String titleEn) { this.titleEn = titleEn; }
    public String getTitleDe() { return titleDe; }
    public void setTitleDe(String titleDe) { this.titleDe = titleDe; }
    public String getDateText() { return dateText; }
    public void setDateText(String dateText) { this.dateText = dateText; }
    public String getContentEn() { return contentEn; }
    public void setContentEn(String contentEn) { this.contentEn = contentEn; }
    public String getContentDe() { return contentDe; }
    public void setContentDe(String contentDe) { this.contentDe = contentDe; }
    public String getQuoteEn() { return quoteEn; }
    public void setQuoteEn(String quoteEn) { this.quoteEn = quoteEn; }
    public String getQuoteDe() { return quoteDe; }
    public void setQuoteDe(String quoteDe) { this.quoteDe = quoteDe; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getPdfUrl() { return pdfUrl; }
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }
}