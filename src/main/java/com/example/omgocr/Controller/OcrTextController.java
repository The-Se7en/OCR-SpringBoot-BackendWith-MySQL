package com.example.omgocr.Controller;

import com.example.omgocr.Repository.OcrTextRepository;
import com.example.omgocr.Service.OcrTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("textApi")
public class OcrTextController {
    @Autowired
    OcrTextRepository ocrTextRepository;
    @Autowired
    OcrTextService ocrTextService;

}
