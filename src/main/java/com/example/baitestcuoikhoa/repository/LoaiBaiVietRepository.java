package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.LoaiBaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiBaiVietRepository extends JpaRepository<LoaiBaiViet,Integer> {
}
