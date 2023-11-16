package com.example.baitestcuoikhoa.repository;

import com.example.baitestcuoikhoa.model.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HocVienRepository extends JpaRepository<HocVien,Integer> {
   @Query("select hv from HocVien hv where hv.hoTen =: key or hv.email =: key")
    List<HocVien>findByHoTenAndAndEmail(@Param("key") String key);
    List<HocVien> findByEmail(String email);
    List<HocVien> findByHoTen(String hoTen);
}
