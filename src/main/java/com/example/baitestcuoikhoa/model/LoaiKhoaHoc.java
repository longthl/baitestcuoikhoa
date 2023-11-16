package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LoaiKhoaHoc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoaiKhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoaiKhoaHocID")
    private int LoaiKhoaHocID;
    @Column(name = "TenLoai")
    private String tenLoai;
}
