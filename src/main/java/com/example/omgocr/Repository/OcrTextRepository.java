package com.example.omgocr.Repository;

import com.example.omgocr.Model.OcrText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcrTextRepository extends JpaRepository<OcrText,Integer> {
}
