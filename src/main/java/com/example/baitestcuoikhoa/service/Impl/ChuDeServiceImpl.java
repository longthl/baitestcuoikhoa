package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.ChuDe;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.repository.ChuDeRepository;
import com.example.baitestcuoikhoa.service.ChuDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuDeServiceImpl implements ChuDeService {
@Autowired
    ChuDeRepository chuDeRepository;

    @Override
    public List<ChuDe> getAll() {
        return chuDeRepository.findAll();
    }

    @Override
    public Respon<ChuDe> insert(ChuDe chuDe) {
        Respon<ChuDe>respon=new Respon<>();
        if(chuDe.getTenChuDe()!=null&&chuDe.getNoiDung()!=null&&chuDe.getLoaiBaiViet()!=null) {
            chuDeRepository.save(chuDe);
            respon.setError("thành công");
        }else {
            respon.setError("Không thành công");
        }
        return respon;
    }

    @Override
    public void delete(int chuDeID) {
    chuDeRepository.deleteById(chuDeID);
    }

    @Override
    public ChuDe update(ChuDe chuDe, int chuDeID) {
        ChuDe chuDe1=chuDeRepository.findById(chuDeID).orElse(null);
        chuDe1.setTenChuDe(chuDe.getTenChuDe());
        chuDe1.setLoaiBaiViet(chuDe.getLoaiBaiViet());
        chuDe1.setNoiDung(chuDe.getNoiDung());
        return chuDeRepository.save(chuDe1);
    }

    @Override
    public Page<ChuDe> page(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return chuDeRepository.findAll(pageable);
    }
}
