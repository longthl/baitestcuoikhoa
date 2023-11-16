package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.QuyenHan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenHanRepository extends JpaRepository<QuyenHan,Integer> {
}
