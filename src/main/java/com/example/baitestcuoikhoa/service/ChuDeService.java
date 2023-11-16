package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.ChuDe;
import com.example.baitestcuoikhoa.model.respon.Respon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ChuDeService {
    List<ChuDe>getAll();
    Respon<ChuDe> insert(ChuDe chuDe);
    void delete(int chuDeID);
    ChuDe update(ChuDe chuDe,int chuDeID);
    Page<ChuDe>page(int page);
}
