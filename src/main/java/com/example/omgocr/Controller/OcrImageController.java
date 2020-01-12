package com.example.omgocr.Controller;

import com.example.omgocr.Model.OcrImage;
import com.example.omgocr.Repository.OcrImageRepository;
import com.example.omgocr.Service.OcrImageService;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("imageApi")
public class OcrImageController {
    @Autowired
    OcrImageRepository ocrImageRepository;
    @Autowired
    OcrImageService ocrImageService;
    @PostMapping("postImage")
    public String postImg(@RequestParam("image") MultipartFile file)
    {
        try {
            if (file == null) {
                System.out.println("null file");
            }else
            {
                byte[] imageBytes = file.getBytes();
                String fileDirPath = "C:\\Users\\Home\\Documents\\Android Image Upload To Spring\\images";
                File fileDir = new File(fileDirPath);
                File dest = new File(fileDir,  file.getOriginalFilename());
                file.transferTo(dest);
                OcrImage image=new OcrImage("amal",fileDir.toString());
                //ocrImageRepository.save(image);

                File fileImag=new File(image.getImgPath()+"\\"+file.getOriginalFilename());
                ITesseract ins=new Tesseract();
                try{
                    String result=ins.doOCR(fileImag);
                    return result;
                }catch (Exception e)
                {
                    System.out.println("excep");
                }
            }
        }catch (Exception e)
        {
            System.out.println("exception");
        }
        return "";
    }
}
