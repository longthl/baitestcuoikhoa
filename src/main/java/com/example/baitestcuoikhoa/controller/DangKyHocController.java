package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.DangKyHoc;
import com.example.baitestcuoikhoa.service.DangKyHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dang-ky-hoc")
public class DangKyHocController {
    @Autowired
    DangKyHocService dangKyHocService;
    @GetMapping("/hien-thi")
    public List<DangKyHoc> getAll(){
       List<DangKyHoc>list= dangKyHocService.getAll();
    return list;
    }
    @PostMapping("/insert")
    public String insert(@RequestBody DangKyHoc dangKyHoc){

        return "Thành công";
    }
    @PutMapping("/update/{dangKyHocID}")
    public String update(@PathVariable("dangKyHocID")int id,@RequestBody DangKyHoc dangKyHoc){
        dangKyHocService.update(dangKyHoc,id);
        return "Thành công";
    }
    @DeleteMapping("/delete/{dangKyHocID}")
    public String delete(@PathVariable("dangKyHocID")int id){
        dangKyHocService.delete(id);
        return "Thành công";
    }
    @GetMapping("/page")
    public Page<DangKyHoc> phantrang(@RequestParam(defaultValue = "0",value = "page")int page){
        Page<DangKyHoc>list=dangKyHocService.phantrang(page);
        return list;
    }
}
