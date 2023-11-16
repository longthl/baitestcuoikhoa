package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
List<BaiViet>findByTenBaiViet(String tenBaiViet);
}
