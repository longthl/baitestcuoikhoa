package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.DangKyHoc;
import com.example.baitestcuoikhoa.model.HocVien;
import com.example.baitestcuoikhoa.model.KhoaHoc;
import com.example.baitestcuoikhoa.model.TinhTrangHoc;
import com.example.baitestcuoikhoa.repository.DangKyHocRepository;
import com.example.baitestcuoikhoa.repository.KhoaHocRepository;
import com.example.baitestcuoikhoa.service.DangKyHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DangKyHocServiceImpl implements DangKyHocService {
@Autowired
    DangKyHocRepository dangKyHocRepository;
@Autowired
    KhoaHocRepository khoaHocRepository;

    @Override
    public List<DangKyHoc> getAll() {
        return dangKyHocRepository.findAll();
    }

    @Override
    public void insert(int khoaHocID, HocVien hocVien) {
        KhoaHoc khoaHoc=khoaHocRepository.findById(khoaHocID).orElse(null);
         if(khoaHoc!= null) {
             DangKyHoc dangKyHoc = new DangKyHoc();
             dangKyHoc.setKhoaHoc(khoaHoc);
             dangKyHoc.setHocVien(hocVien);
             dangKyHoc.setTinhTrangHoc(new TinhTrangHoc());
             khoaHoc.setSoHocVien(khoaHoc.getSoHocVien() + 1);
             khoaHocRepository.save(khoaHoc);
             dangKyHocRepository.save(dangKyHoc);
         }
    }

    @Override
    public void delete(int dangKyHocID) {
    dangKyHocRepository.deleteById(dangKyHocID);
    }

    @Override
    public DangKyHoc update(DangKyHoc dangKyHoc, int dangKyHocID) {
        DangKyHoc dangKyHoc1=dangKyHocRepository.findById(dangKyHocID).orElse(null);
        dangKyHoc1.setHocVien(dangKyHoc.getHocVien());
        dangKyHoc1.setKhoaHoc(dangKyHoc.getKhoaHoc());
        dangKyHoc1.setNgayDangKy(dangKyHoc.getNgayDangKy());
        dangKyHoc1.setTinhTrangHoc(dangKyHoc.getTinhTrangHoc());
        dangKyHoc1.setNgayKetThuc(dangKyHoc.getNgayKetThuc());
        dangKyHoc1.setTaiKhoan(dangKyHoc.getTaiKhoan());
        dangKyHoc1.setNgayBatDau(dangKyHoc.getNgayBatDau());

        return dangKyHocRepository.save(dangKyHoc1);
    }

    @Override
    public Page<DangKyHoc> phantrang(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return dangKyHocRepository.findAll(pageable);
    }
}
