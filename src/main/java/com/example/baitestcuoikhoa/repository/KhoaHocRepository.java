package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.KhoaHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc,Integer> {
List<KhoaHoc>findByTenKhoaHoc(String tenKhoaHoc);
}
