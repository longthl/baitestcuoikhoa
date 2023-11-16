package com.example.baitestcuoikhoa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ChuDe")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChuDe {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ChuDeID")
    private int ChuDeID;
@Column(name="TenChuDe")
    private String tenChuDe;
@Column(name="NoiDung")
    private String NoiDung;
@ManyToOne
@JoinColumn(name="LoaiBaiVietID")
    private LoaiBaiViet LoaiBaiViet;
}
