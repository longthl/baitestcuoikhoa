package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "BaiViet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaiViet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BaiVietID")
    private int baiVietID;
    @Column(name = "TenBaiViet")
    private String tenBaiViet;
    @Column(name = "ThoiGianTao")
    private LocalDate thoiGianTao;
    @Column(name = "TenTacGia")
    private String tenTacGia;
    @Column(name = "NoiDung")
    private String noiDung;
    @Column(name = "NoiDungNgan")
    private String noiDungNgan;
    @Column(name = "HinhAnh")
    private String hinhAnh;
    @ManyToOne
    @JoinColumn(name = "ChuDeID")
    private ChuDe ChuDe;
    @ManyToOne
    @JoinColumn(name="TaiKhoanID")
    private TaiKhoan TaiKhoan;
}
