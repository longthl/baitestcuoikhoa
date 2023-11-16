package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.TinhTrangHoc;

import java.util.List;

public interface TinhTrangHocService {
    List<TinhTrangHoc>getAll();
    void insert(TinhTrangHoc tinhTrangHoc);
    void delete(int tinhTrangHocID);
    void update(TinhTrangHoc tinhTrangHoc,int tinhTrangHocID);
}
