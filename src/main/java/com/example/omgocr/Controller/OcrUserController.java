package com.example.omgocr.Controller;

import com.example.omgocr.Model.OcrUser;
import com.example.omgocr.Repository.OcrUserRepository;
import com.example.omgocr.Service.OcrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocrUserApi/")
@CrossOrigin()
public class OcrUserController {
    @Autowired
    OcrUserRepository ocrUserRepository;
    @Autowired
    OcrUserService ocrUserService;

    @PostMapping("postOcr")
    public String postUser(@RequestBody OcrUser ocrUser)
    {
        if(getbyUsername(ocrUser.getUsername())==null)
        {
            ocrUserRepository.save(ocrUser);
            return  "Success";
        }else {
            return "Already exists";
        }

    }

    @GetMapping("getall")
    public List<OcrUser>getAll()
    {
        return ocrUserRepository.findAll();
    }

    @GetMapping("userbyname/{name}")
    public OcrUser getbyUsername(@PathVariable String name)
    {
        return ocrUserRepository.findOcrUsersByUsername(name);
    }

    @PostMapping("loginReq")
    public String getunameAndPass(@RequestBody OcrUser ocrUser)
    {
        String enteredPasword=ocrUser.getPassword();
        String correctPaasword=checkUserLogin(ocrUser.getUsername()).getPassword();
        if(enteredPasword.equals(correctPaasword))
        {
            return "Correct Password";
        }else
        {
            return "Wrong Password";
        }
    }

    @GetMapping("getLoginInfo")
    public OcrUser checkUserLogin(@RequestParam String name)
    {
        return  ocrUserRepository.findOcrUsersByUsername(name);
    }

}
