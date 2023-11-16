package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LoaiBaiViet")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LoaiBaiViet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoaiBaiVietID")
    private int LoaiBaiVietID;
    @Column(name = "TenLoai")
    private String tenLoai;
}
