package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.TinhTrangHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TinhTrangHocRepository extends JpaRepository<TinhTrangHoc,Integer> {

}
