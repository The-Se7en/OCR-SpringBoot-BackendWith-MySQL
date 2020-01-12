package com.example.omgocr.Repository;

import com.example.omgocr.Model.OcrImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcrImageRepository extends JpaRepository<OcrImage,Integer> {
}
