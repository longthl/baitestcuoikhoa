package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;

import java.util.List;
import java.util.Optional;

public interface LoaiKhoaHocService {
    List<LoaiKhoaHoc>getAll();
    void insert(LoaiKhoaHoc loaiKhoaHoc);
    Optional<LoaiKhoaHoc> getById(int loaiKhoaHocID);
    void delete(int loaiKhoaHocID);
    void update(LoaiKhoaHoc loaiKhoaHoc,int loaiKhoaHocID);
}
