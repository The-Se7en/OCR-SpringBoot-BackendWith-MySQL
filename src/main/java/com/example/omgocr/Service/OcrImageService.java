package com.example.omgocr.Service;

import com.example.omgocr.Repository.OcrImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcrImageService {
    @Autowired
    OcrImageRepository ocrImageRepository;

    public OcrImageService(OcrImageRepository ocrImageRepository) {
        this.ocrImageRepository=ocrImageRepository;
    }
}
