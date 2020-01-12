package com.example.omgocr.Service;

import com.example.omgocr.Repository.OcrTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcrTextService {
    @Autowired
    OcrTextRepository ocrTextRepository;

    public OcrTextService(OcrTextRepository ocrTextRepository) {
        this.ocrTextRepository=ocrTextRepository;
    }
}
