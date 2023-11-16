package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.TinhTrangHoc;
import com.example.baitestcuoikhoa.repository.TinhTrangHocRepository;
import com.example.baitestcuoikhoa.service.TinhTrangHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TinhTrangHocServiceImpl implements TinhTrangHocService {
@Autowired
    TinhTrangHocRepository tinhTrangHocRepository;

    @Override
    public List<TinhTrangHoc> getAll() {
        return tinhTrangHocRepository.findAll();
    }

    @Override
    public void insert(TinhTrangHoc tinhTrangHoc) {
      tinhTrangHocRepository.save(tinhTrangHoc);
    }

    @Override
    public void delete(int tinhTrangHocID) {
      tinhTrangHocRepository.deleteById(tinhTrangHocID);
    }

    @Override
    public void update(TinhTrangHoc tinhTrangHoc, int tinhTrangHocID) {
     TinhTrangHoc tinhTrangHoc1=tinhTrangHocRepository.getById(tinhTrangHocID);
     tinhTrangHoc1.setTenTinhTrang(tinhTrangHoc.getTenTinhTrang());
     tinhTrangHocRepository.save(tinhTrangHoc1);
    }
}
