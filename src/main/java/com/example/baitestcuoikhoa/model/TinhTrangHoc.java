package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TinhTrangHoc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TinhTrangHoc {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TinhTrangHocID")
    private int tinhTrangHocID;
    @Column(name="TenTinhTrang")
    private String tenTinhTrang;
}
