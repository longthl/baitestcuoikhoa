package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.LoaiKhoaHoc;
import com.example.baitestcuoikhoa.service.LoaiKhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loai-khoa-hoc")
public class LoaiKhoaHocController {
    @Autowired
    LoaiKhoaHocService loaiKhoaHocService;
    @GetMapping("/hienthi")
    public List<LoaiKhoaHoc> getAll(){
        List<LoaiKhoaHoc> list=loaiKhoaHocService.getAll();
        return list;
    }
    @PostMapping("/them")
    public String insert(@RequestBody LoaiKhoaHoc loaiKhoaHoc){
        loaiKhoaHocService.insert(loaiKhoaHoc);
        return "Thành công";
    }
    @DeleteMapping("/xoa/{id}")
    public String delete(@PathVariable("id")int id){
        loaiKhoaHocService.delete(id);
        return "Xóa thành công";
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable("id")int id,@RequestBody LoaiKhoaHoc loaiKhoaHoc){
        loaiKhoaHocService.update(loaiKhoaHoc,id);
       return "Update thành công";
    }
}
