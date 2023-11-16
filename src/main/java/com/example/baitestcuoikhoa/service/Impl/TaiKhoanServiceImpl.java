package com.example.baitestcuoikhoa.service.Impl;

import com.example.baitestcuoikhoa.model.TaiKhoan;
import com.example.baitestcuoikhoa.repository.TaiKhoanReppsitory;
import com.example.baitestcuoikhoa.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
@Autowired
    TaiKhoanReppsitory taiKhoanReppsitory;

    @Override
    public List<TaiKhoan> getAll() {
        return taiKhoanReppsitory.findAll();
    }

    @Override
    public void insert(TaiKhoan taiKhoan) {
        List<TaiKhoan>tk=taiKhoanReppsitory.findByTaiKhoan(taiKhoan.getTaiKhoan());
        if(tk!=null){
      String password=taiKhoan.getMatKhau();
      if(isPasswordValid(password)){
          taiKhoanReppsitory.save(taiKhoan);
      }

        }

    }
    private boolean isPasswordValid(String password) {
        return password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*");
    }
    @Override
    public void delete(int taiKhoanID) {
   taiKhoanReppsitory.deleteById(taiKhoanID);
    }

    @Override
    public TaiKhoan update(int taiKhoanID, TaiKhoan taiKhoan) {
        TaiKhoan taiKhoan1=taiKhoanReppsitory.findById(taiKhoanID).orElse(null);
        taiKhoan1.setTaiKhoan(taiKhoan.getTaiKhoan());
        taiKhoan1.setMatKhau(taiKhoan.getMatKhau());
        taiKhoan1.setQuyenHan(taiKhoan.getQuyenHan());
        taiKhoan1.setTenNguoiDung(taiKhoan.getTenNguoiDung());
        return taiKhoanReppsitory.save(taiKhoan1);
    }

    @Override
    public List<TaiKhoan> findby(String tennd) {
        return taiKhoanReppsitory.findByTenNguoiDung(tennd);
    }
}
