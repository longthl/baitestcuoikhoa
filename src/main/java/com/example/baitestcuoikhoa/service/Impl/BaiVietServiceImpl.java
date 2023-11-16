package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.BaiViet;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.repository.BaiVietRepository;
import com.example.baitestcuoikhoa.service.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BaiVietServiceImpl implements BaiVietService {
@Autowired
    BaiVietRepository baiVietRepository;

    @Override
    public List<BaiViet> getAll() {
        return baiVietRepository.findAll();
    }

    @Override
    public Respon<BaiViet> insert(BaiViet baiViet) {
        Respon<BaiViet>respon=new Respon<>();
        if(baiViet.getTenBaiViet()!=null&&baiViet.getHinhAnh()!=null&&baiViet.getNoiDung()!=null&&baiViet.getNoiDungNgan()!=null&&baiViet.getTenTacGia()!=null&&baiViet.getTaiKhoan()!=null){
            baiViet.setThoiGianTao(LocalDate.now());
            baiVietRepository.save(baiViet);
            respon.setError("Thành công");
        }else {
            respon.setError("Ko thành công");
        }
     return respon;
    }

    @Override
    public void delete(int baiVietID) {
     baiVietRepository.deleteById(baiVietID);
    }

    @Override
    public BaiViet update(int baiVietID, BaiViet baiViet) {
        BaiViet baiViet1=baiVietRepository.findById(baiVietID).orElse(null);
        baiViet1.setTenBaiViet(baiViet.getTenBaiViet());
        baiViet1.setNoiDung(baiViet.getNoiDung());
        baiViet1.setChuDe(baiViet.getChuDe());
        baiViet1.setHinhAnh(baiViet.getHinhAnh());
        baiViet1.setNoiDungNgan(baiViet.getNoiDungNgan());
        baiViet1.setChuDe(baiViet.getChuDe());
        baiViet1.setTenTacGia(baiViet.getTenTacGia());
        baiViet1.setTaiKhoan(baiViet.getTaiKhoan());
        baiViet1.setThoiGianTao(baiViet.getThoiGianTao());
        return baiVietRepository.save(baiViet1);
    }

    @Override
    public List<BaiViet> findby(String tenBaiViet) {
        return baiVietRepository.findByTenBaiViet(tenBaiViet);
    }

    @Override
    public Page<BaiViet> page(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return baiVietRepository.findAll(pageable);
    }
}
