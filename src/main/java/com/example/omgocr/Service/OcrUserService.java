package com.example.omgocr.Service;

import com.example.omgocr.Model.OcrUser;
import com.example.omgocr.Repository.OcrUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcrUserService {
    @Autowired
    OcrUserRepository ocrUserRepository;

    public OcrUserService(OcrUserRepository ocrUserRepository) {
        this.ocrUserRepository=ocrUserRepository;
    }

    public List<OcrUser>getAll(){
        return ocrUserRepository.findAll();
    }
}
