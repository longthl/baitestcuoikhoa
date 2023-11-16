package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TaiKhoan")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TaiKhoanID")
    private int taiKhoanID;
    @Column(name="TenNguoiDung")
    private String tenNguoiDung;
    @Column(name="TaiKhoan")
    private String taiKhoan;
    @Column(name="MatKhau")
    private String matKhau;
    @ManyToOne
    @JoinColumn(name="QuyenHanID")
    private QuyenHan QuyenHan;
}
