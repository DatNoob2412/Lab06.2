package com.example.lab062;

public class NewsItem {
    private String imageUrl;
    private String title;
    private String url;

    public NewsItem(String imageUrl, String title, String url) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
