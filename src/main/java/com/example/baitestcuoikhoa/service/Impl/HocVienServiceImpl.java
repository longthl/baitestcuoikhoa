package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.HocVien;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.repository.HocVienRepository;
import com.example.baitestcuoikhoa.service.HocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class HocVienServiceImpl implements HocVienService {
@Autowired
    HocVienRepository hocVienRepository;

    @Override
    public List<HocVien> getAll() {
        return hocVienRepository.findAll();
    }

    @Override
    public Respon<HocVien> insert(HocVien hocVien) {
        Respon<HocVien>respon=new Respon<>();
        List<HocVien> email=hocVienRepository.findByEmail(hocVien.getEmail());
        List<HocVien> hoten=hocVienRepository.findByHoTen(hocVien.getHoTen());
           if(email !=null && hoten !=null) {
             String ht=hocVien.getHoTen().toUpperCase();
             hocVien.setHoTen(ht);
               hocVienRepository.save(hocVien);
               respon.setError("thành công");
           }else {
               respon.setError("Không thành công");
           }
     return respon;
    }

    @Override
    public void capnhat(HocVien hocVien, int hocVienID) {
     HocVien hocVien1=hocVienRepository.getById(hocVienID);
     hocVien1.setEmail(hocVien.getEmail());
     hocVien1.setHinhAnh(hocVien.getHinhAnh());
     hocVien1.setHoTen(hocVien.getHoTen());
     hocVien1.setQuanHuyen(hocVien.getQuanHuyen());
     hocVien1.setPhuongXa(hocVien.getPhuongXa());
     hocVien1.setSoNha(hocVien.getSoNha());
     hocVien1.setTinhThanh(hocVien.getTinhThanh());
     hocVien1.setSdt(hocVien.getSdt());
     hocVien1.setNgaySinh(hocVien.getNgaySinh());
     hocVienRepository.save(hocVien1);
    }

    @Override
    public void delete(int hocVienID) {
     hocVienRepository.deleteById(hocVienID);
    }

    @Override
    public List<HocVien> timkiemtenandemail(String key) {
        return hocVienRepository.findByHoTenAndAndEmail(key);
    }

    @Override
    public Page<HocVien> phantrang(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return hocVienRepository.findAll(pageable);
    }
}
