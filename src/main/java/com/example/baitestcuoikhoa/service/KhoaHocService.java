package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.KhoaHoc;
import com.example.baitestcuoikhoa.model.respon.Respon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface KhoaHocService {
    List<KhoaHoc>getAll();
    Respon<KhoaHoc> insert(KhoaHoc khoaHoc);
    List<KhoaHoc>getByTen(String tenKhoaHoc);
    void delete(int khoaHocID);
    Page<KhoaHoc> phantrang(int page);
    void capnhap(KhoaHoc khoaHoc,int khoaHocID);
    KhoaHoc update(int khoaHocID,int sl);
}
