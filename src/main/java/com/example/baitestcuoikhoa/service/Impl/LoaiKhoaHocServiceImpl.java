package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;
import com.example.baitestcuoikhoa.repository.LoaiKhoaHocRepository;
import com.example.baitestcuoikhoa.service.LoaiKhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiKhoaHocServiceImpl implements LoaiKhoaHocService {
@Autowired
    LoaiKhoaHocRepository loaiKhoaHocRepository;

    @Override
    public List<LoaiKhoaHoc> getAll() {
        return loaiKhoaHocRepository.findAll();
    }

    @Override
    public void insert(LoaiKhoaHoc loaiKhoaHoc) {
      loaiKhoaHocRepository.save(loaiKhoaHoc);
    }

    @Override
    public Optional<LoaiKhoaHoc> getById(int loaiKhoaHocID) {
        return loaiKhoaHocRepository.findById(loaiKhoaHocID);
    }

    @Override
    public void delete(int loaiKhoaHocID) {
        loaiKhoaHocRepository.deleteById(loaiKhoaHocID);
    }

    @Override
    public void update(LoaiKhoaHoc loaiKhoaHoc, int loaiKhoaHocID) {
      LoaiKhoaHoc  lkh=loaiKhoaHocRepository.getById(loaiKhoaHocID);
       lkh.setTenLoai(loaiKhoaHoc.getTenLoai());
        loaiKhoaHocRepository.save(lkh);
    }
}
