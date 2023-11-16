package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanReppsitory extends JpaRepository<TaiKhoan,Integer> {
List<TaiKhoan>findByTenNguoiDung(String tenNguoiDung);
List<TaiKhoan>findByTaiKhoan(String taiKhoan);
}
