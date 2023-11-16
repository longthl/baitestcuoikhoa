package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.TaiKhoan;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoan>getAll();
    void insert(TaiKhoan taiKhoan);
    void delete(int taiKhoanID);
    TaiKhoan update(int taiKhoanID,TaiKhoan taiKhoan);
    List<TaiKhoan>findby(String tennd);

}
