package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.QuyenHan;
import com.example.baitestcuoikhoa.service.QuyenHanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quyen-han")
public class QuyenHanController {
    @Autowired
    QuyenHanService quyenHanService;
    @GetMapping("/hienthi")
    public List<QuyenHan>getAll(){
        List<QuyenHan>list=quyenHanService.getAll();
        return list;
    }
    @PostMapping("/insert")
    public String insert(@RequestBody QuyenHan quyenHan){
        quyenHanService.insert(quyenHan);
        return "Thành công";
    }
    @DeleteMapping("/delete/{quyenHanID}")
    public String delete(@PathVariable("quyenHanID")int id){
        quyenHanService.delete(id);
        return "Thành công";
    }
    @PutMapping("/update/{quyenHanID}")
    public String update(@PathVariable("quyenHanID")int id,@RequestBody QuyenHan quyenHan){
        quyenHanService.update(quyenHan,id);
        return "Thành công";
    }
    @GetMapping("/page")
    public Page<QuyenHan>page(@RequestParam(defaultValue = "0",value = "page")int page){
        Page<QuyenHan>list=quyenHanService.page(page);
        return list;
    }
}
