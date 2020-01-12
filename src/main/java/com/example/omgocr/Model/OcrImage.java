package com.example.omgocr.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OcrImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int imgId;
    private String username;
    private String imgPath;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public OcrImage(String username, String imgPath) {
        this.username = username;
        this.imgPath = imgPath;
    }

    public OcrImage() {
    }
}
