package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.LoaiBaiViet;
import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;
import org.springframework.data.domain.Page;

import java.util.List;

public interface LoaiBaiVietService {
    List<LoaiBaiViet>getAll();
    void insert(LoaiBaiViet loaiBaiViet);
    void delete(int loaiBaiVietID);
    LoaiBaiViet update(LoaiBaiViet loaiBaiViet,int loaiBaiVietID);
    Page<LoaiBaiViet> page(int page);
}
