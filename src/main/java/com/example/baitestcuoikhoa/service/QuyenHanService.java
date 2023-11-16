package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.QuyenHan;
import org.springframework.data.domain.Page;

import java.util.List;

public interface QuyenHanService {
    List<QuyenHan>getAll();
    void insert(QuyenHan quyenHan);
    void delete(int quyenHanID);
    QuyenHan update(QuyenHan quyenHan,int quyenHanID);
    Page<QuyenHan>page(int page);
}
