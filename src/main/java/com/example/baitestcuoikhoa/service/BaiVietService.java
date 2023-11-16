package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.BaiViet;
import com.example.baitestcuoikhoa.model.respon.Respon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaiVietService {
    List<BaiViet>getAll();
    Respon<BaiViet> insert(BaiViet baiViet);
    void delete(int baiVietID);
    BaiViet update(int baiVietID,BaiViet baiViet);
    List<BaiViet>findby(String tenBaiViet);
    Page<BaiViet>page(int page);
}
