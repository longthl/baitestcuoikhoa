package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "DangKyHoc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DangKyHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DangKyHocID")
    private int dangKyHocID;
    @ManyToOne
    @JoinColumn(name = "KhoaHocID")
    private KhoaHoc KhoaHoc;
    @ManyToOne
    @JoinColumn(name = "HocVienID")
    private HocVien HocVien;
    @Column(name = "NgayDangKy")
    private LocalDate ngayDangKy;
    @Column(name="NgayBatDau")
    private LocalDate ngayBatDau;
    @Column(name = "NgayKetThuc")
    private LocalDate ngayKetThuc;
    @ManyToOne
    @JoinColumn(name = "TinhTrangHocID")
    private TinhTrangHoc TinhTrangHoc;
    @ManyToOne
    @JoinColumn(name = "TaiKhoanID")
    private TaiKhoan TaiKhoan;
    @PrePersist
    public void prePersist(){
        this.ngayDangKy=LocalDate.now();
        if(this.TinhTrangHoc != null && "Đang học chính".equals(this.TinhTrangHoc.getTenTinhTrang())){
            this.ngayBatDau=LocalDate.now();
            if(this.KhoaHoc !=null &&this.KhoaHoc.getThoiGianHoc()>0){
                this.ngayKetThuc=this.ngayBatDau.plusDays(this.KhoaHoc.getThoiGianHoc());
            }
        }
    }
}
