package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="KhoaHoc")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KhoaHoc {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="KhoaHocID")
    private int khoaHocID;
    @Column(name="TenKhoaHoc")
    private String tenKhoaHoc;
    @Column(name="ThoiGianHoc")
    private int thoiGianHoc;
    @Column(name="GioiThieu")
    private String gioiThieu;
    @Column(name="NoiDung")
    private String NoiDung;
    @Column(name="HocPhi")
    private double hocPhi;
    @Column(name="SoHocVien")
    private int soHocVien;
    @Column(name="SoLuongMon")
    private int soLuongMon;
    @Column(name="HinhAnh")
    private String hinhAnh;
    @ManyToOne
    @JoinColumn(name="LoaiKhoaHocID")
    private LoaiKhoaHoc loaiKhoaHoc;
}
