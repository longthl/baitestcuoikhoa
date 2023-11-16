package com.example.baitestcuoikhoa.service;

import com.example.baitestcuoikhoa.model.HocVien;
import com.example.baitestcuoikhoa.model.respon.Respon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HocVienService {
    List<HocVien>getAll();
    Respon<HocVien> insert(HocVien hocVien);
    void capnhat(HocVien hocVien,int hocVienID);
    void delete(int hocVienID);
    List<HocVien>timkiemtenandemail(String key);
  Page<HocVien>phantrang(int page);
}
