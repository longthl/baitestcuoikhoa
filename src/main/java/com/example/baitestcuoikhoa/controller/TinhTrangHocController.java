package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.TinhTrangHoc;
import com.example.baitestcuoikhoa.service.TinhTrangHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tinh-trang-hoc")
public class TinhTrangHocController {
    @Autowired
    TinhTrangHocService tinhTrangHocService;
    @GetMapping("/hienthi")
    public List<TinhTrangHoc>getAll(){
        List<TinhTrangHoc>list=tinhTrangHocService.getAll();
        return list;
    }
    @PostMapping("/them")
    public String insert(@RequestBody TinhTrangHoc tinhTrangHoc){
        tinhTrangHocService.insert(tinhTrangHoc);
        return "thành công";
    }
    @PutMapping("/update/{tinhTrangHocID}")
    public String update(@PathVariable("tinhTrangHocID")int id,@RequestBody TinhTrangHoc tinhTrangHoc){
        tinhTrangHocService.update(tinhTrangHoc,id);
        return "Thành công";
    }
    @PutMapping("/delete/{tinhTrangHocID}")
    public String delete(@PathVariable("tinhTrangHocID")int id){
        tinhTrangHocService.delete(id);
        return "Thành công";
    }
}
