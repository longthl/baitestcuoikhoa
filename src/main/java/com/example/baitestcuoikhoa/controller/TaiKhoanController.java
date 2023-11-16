package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.TaiKhoan;
import com.example.baitestcuoikhoa.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tai-khoan")
public class TaiKhoanController {
@Autowired
    TaiKhoanService taiKhoanService;
@GetMapping("/hienthi")
    public List<TaiKhoan>getAll(){
    List<TaiKhoan>list=taiKhoanService.getAll();
    return list;
}
@PostMapping("/insert")
    public String insert(@RequestBody TaiKhoan taiKhoan){
    taiKhoanService.insert(taiKhoan);
    return "Thành công";
}
@DeleteMapping("/delete/{taiKhoanID}")
    public String delete(@PathVariable("taiKhoanID")int id){
    taiKhoanService.delete(id);
    return "Thành công";
}
@PutMapping("/update/{taiKhoanID}")
    public String update(@PathVariable("taiKhoanID")int id,@RequestBody TaiKhoan taiKhoan){
    taiKhoanService.update(id,taiKhoan);
    return "Thành công";
}
@GetMapping("/timkiem")
    public List<TaiKhoan>timkiem(@RequestParam("tenNguoiDung")String tennd){
    List<TaiKhoan>list=taiKhoanService.findby(tennd);
    return list;
}
}
