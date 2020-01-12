package com.example.omgocr.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OcrText {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int textid;
    private String imageId;
    private String textResult;

    public int getTextid() {
        return textid;
    }

    public void setTextid(int textid) {
        this.textid = textid;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTextResult() {
        return textResult;
    }

    public void setTextResult(String textResult) {
        this.textResult = textResult;
    }

    public OcrText(String imageId, String textResult) {
        this.imageId = imageId;
        this.textResult = textResult;
    }

    public OcrText() {
    }
}
