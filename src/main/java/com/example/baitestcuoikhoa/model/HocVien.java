package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "HocVien")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HocVienID")
    private int hocVienID;
    @Column(name = "HinhAnh")
    private String hinhAnh;
    @Column(name = "HoTen")
    private String hoTen;
    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "Email")
    private String email;
    @Column(name = "TinhThanh")
    private String tinhThanh;
    @Column(name = "QuanHuyen")
    private String quanHuyen;
    @Column(name = "PhuongXa")
    private String phuongXa;
    @Column(name = "SoNha")
    private String soNha;
}
