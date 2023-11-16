package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.DangKyHoc;
import com.example.baitestcuoikhoa.model.HocVien;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DangKyHocService {
    List<DangKyHoc>getAll();
   void insert(int khoaHocID, HocVien hocVien);
    void delete(int dangKyHocID);
    DangKyHoc update(DangKyHoc dangKyHoc,int dangKyHocID);
   Page<DangKyHoc>phantrang(int page);
}
