package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="QuyenHan")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuyenHan {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="QuyenHanID")
    private int quyenHanID;
    @Column(name="TenQuyenHan")
    private String tenQuyenHan;
}
