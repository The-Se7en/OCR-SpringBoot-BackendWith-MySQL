package com.example.omgocr.Repository;

import com.example.omgocr.Model.OcrUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcrUserRepository extends JpaRepository<OcrUser,String> {
    OcrUser findOcrUsersByUsername(String username);
}
