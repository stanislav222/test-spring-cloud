package com.example.userservice.model;

public class JustInfo {

    private Long id;
    private String title;
    private String imgName;

    public JustInfo() {
    }

    public JustInfo(Long id, String title, String imgName) {
        this.id = id;
        this.title = title;
        this.imgName = imgName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

}
