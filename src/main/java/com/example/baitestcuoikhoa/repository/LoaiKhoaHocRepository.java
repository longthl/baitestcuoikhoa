package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiKhoaHocRepository extends JpaRepository<LoaiKhoaHoc,Integer> {
@Query("select lkh from LoaiKhoaHoc lkh where lkh.LoaiKhoaHocID =: loaiKhoaHocID")
    LoaiKhoaHoc findByLoaiKhoaHocID(@Param("id") int loaiKhoaHocID);
}
