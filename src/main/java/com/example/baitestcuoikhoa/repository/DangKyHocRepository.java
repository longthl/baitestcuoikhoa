package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.DangKyHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DangKyHocRepository extends JpaRepository<DangKyHoc,Integer> {
}
