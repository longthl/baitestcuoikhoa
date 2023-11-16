package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.LoaiBaiViet;
import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;
import com.example.baitestcuoikhoa.repository.LoaiBaiVietRepository;
import com.example.baitestcuoikhoa.service.LoaiBaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiBaiVietServiceImpl implements LoaiBaiVietService {
@Autowired
    LoaiBaiVietRepository loaiBaiVietRepository;

    @Override
    public List<LoaiBaiViet> getAll() {
        return loaiBaiVietRepository.findAll();
    }

    @Override
    public void insert(LoaiBaiViet loaiBaiViet) {
    loaiBaiVietRepository.save(loaiBaiViet);
    }

    @Override
    public void delete(int loaiBaiVietID) {
    loaiBaiVietRepository.deleteById(loaiBaiVietID);
    }

    @Override
    public LoaiBaiViet update(LoaiBaiViet loaiBaiViet, int loaiBaiVietID) {
       LoaiBaiViet loaiBaiViet1=loaiBaiVietRepository.findById(loaiBaiVietID).orElse(null);
       loaiBaiViet1.setTenLoai(loaiBaiViet.getTenLoai());
        return loaiBaiVietRepository.save(loaiBaiViet);
    }

    @Override
    public Page<LoaiBaiViet> page(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return loaiBaiVietRepository.findAll(pageable);
    }
}
