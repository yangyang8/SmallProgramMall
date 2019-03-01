package com.hailong.pojo;

public class TbProductWithBLOBs extends TbProduct {
    private String description;

    private String imageUrls;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls == null ? null : imageUrls.trim();
    }
}