package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.KhoaHoc;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.repository.KhoaHocRepository;
import com.example.baitestcuoikhoa.service.KhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaHocServiceImpl implements KhoaHocService {
    @Autowired
    KhoaHocRepository khoaHocRepository;

    @Override
    public List<KhoaHoc> getAll() {
        return khoaHocRepository.findAll();
    }

    @Override
    public Respon<KhoaHoc> insert(KhoaHoc khoaHoc) {
        Respon<KhoaHoc>respon=new Respon<>();
        if(khoaHoc.getLoaiKhoaHoc() != null&&khoaHoc.getTenKhoaHoc() !=null&&khoaHoc.getHinhAnh()!=null&&khoaHoc.getGioiThieu()!=null&&khoaHoc.getNoiDung()!=null){
            khoaHocRepository.save(khoaHoc);
            respon.setError("Thành công");
        }else {
            respon.setError("Bắt buộc phải nhập hết");
        }
return respon;
    }

    @Override
    public List<KhoaHoc> getByTen(String tenKhoaHoc) {
        return khoaHocRepository.findByTenKhoaHoc(tenKhoaHoc);
    }

    @Override
    public void delete(int khoaHocID) {
       khoaHocRepository.deleteById(khoaHocID);
    }

    @Override
    public Page<KhoaHoc> phantrang(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return khoaHocRepository.findAll(pageable);
    }

    @Override
    public void capnhap(KhoaHoc khoaHoc, int khoaHocID) {
      KhoaHoc khoaHoc1=khoaHocRepository.getById(khoaHocID);
      khoaHoc1.setTenKhoaHoc(khoaHoc.getTenKhoaHoc());
      khoaHoc1.setLoaiKhoaHoc(khoaHoc.getLoaiKhoaHoc());
      khoaHoc1.setHocPhi(khoaHoc.getHocPhi());
      khoaHoc1.setLoaiKhoaHoc(khoaHoc.getLoaiKhoaHoc());
      khoaHoc1.setGioiThieu(khoaHoc.getGioiThieu());
      khoaHoc1.setHinhAnh(khoaHoc.getHinhAnh());
      khoaHoc1.setThoiGianHoc(khoaHoc.getThoiGianHoc());
      khoaHoc1.setNoiDung(khoaHoc.getNoiDung());
      khoaHoc1.setSoLuongMon(khoaHoc.getSoLuongMon());
      khoaHocRepository.save(khoaHoc1);
    }

    @Override
    public KhoaHoc update(int khoaHocID, int sl) {
       KhoaHoc khoaHoc=khoaHocRepository.findById(khoaHocID).orElse(null);
       int s=khoaHoc.getSoHocVien();
       int u=s+sl;
       khoaHoc.setSoHocVien(u);
        return khoaHocRepository.save(khoaHoc);
    }
}
