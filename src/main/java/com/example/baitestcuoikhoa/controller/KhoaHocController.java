package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.KhoaHoc;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.service.KhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa-hoc")
public class KhoaHocController {
    @Autowired
    KhoaHocService khoaHocService;
    @GetMapping("/hienthi")
    public List<KhoaHoc>getAll(){
        List<KhoaHoc>list=khoaHocService.getAll();
        return list;
    }
    @GetMapping("/phantrang")
    public Page<KhoaHoc>hienthi(@RequestParam(defaultValue = "0",value = "page")Integer page){
        Page<KhoaHoc>list=khoaHocService.phantrang(page);
        return list;
    }


    @PostMapping("/them")
    public Respon<KhoaHoc> insert(@RequestBody KhoaHoc khoaHoc){
      Respon<KhoaHoc>list=  khoaHocService.insert(khoaHoc);
        return list;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id){
        khoaHocService.delete(id);
        return "thành công";
    }
    @PutMapping("/update/{id}")
    public String update (@PathVariable("id")int id,@RequestBody KhoaHoc khoaHoc){
        khoaHocService.capnhap(khoaHoc,id);
        return "thành công";
    }
    @GetMapping("/timkiem/{tenKhoaHoc}")
    public List<KhoaHoc> timkiem(@PathVariable("tenKhoaHoc")String tenKhoaHoc){
        List<KhoaHoc> list=khoaHocService.getByTen(tenKhoaHoc);
        return list;
    }

}
