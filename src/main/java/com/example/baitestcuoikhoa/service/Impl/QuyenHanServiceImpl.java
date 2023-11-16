package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.QuyenHan;
import com.example.baitestcuoikhoa.repository.QuyenHanRepository;
import com.example.baitestcuoikhoa.service.QuyenHanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuyenHanServiceImpl implements QuyenHanService {
@Autowired
    QuyenHanRepository quyenHanRepository;

    @Override
    public List<QuyenHan> getAll() {
        return quyenHanRepository.findAll();
    }

    @Override
    public void insert(QuyenHan quyenHan) {
   quyenHanRepository.save(quyenHan);
    }

    @Override
    public void delete(int quyenHanID) {
    quyenHanRepository.deleteById(quyenHanID);
    }

    @Override
    public QuyenHan update(QuyenHan quyenHan, int quyenHanID) {
        QuyenHan quyenHan1=quyenHanRepository.findById(quyenHanID).orElse(null);
        quyenHan1.setTenQuyenHan(quyenHan.getTenQuyenHan());
        return quyenHanRepository.save(quyenHan1);
    }

    @Override
    public Page<QuyenHan> page(int page) {
        Pageable pageable= PageRequest.of(page,2);
        return quyenHanRepository.findAll(pageable);
    }
}
