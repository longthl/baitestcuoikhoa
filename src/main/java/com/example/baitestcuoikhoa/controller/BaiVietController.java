package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.BaiViet;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.service.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bai-viet")
public class BaiVietController {
    @Autowired
    BaiVietService baiVietService;
    @GetMapping("/hienthi")
    public List<BaiViet>getAll(){
        List<BaiViet>list=baiVietService.getAll();
        return list;
    }
    @PostMapping("/insert")
    public Respon<BaiViet> insert(@RequestBody BaiViet baiViet){
        Respon<BaiViet>list=baiVietService.insert(baiViet);

        return list;
    }
    @PutMapping("/update/{baiVietID}")
    public String update(@PathVariable("baiVietID")int id,@RequestBody BaiViet baiViet){
       baiVietService.update(id,baiViet);
        return "Thành công";
    }
    @DeleteMapping("/delete/{baiVietID}")
    public String delete(@PathVariable("baiVietID")int id){
        baiVietService.delete(id);
        return "Thành công";
    }
    @GetMapping("/timkiem")
    public List<BaiViet> timkiem(@RequestParam("tenBaiViet")String tenBaiViet){
       List<BaiViet>list= baiVietService.findby(tenBaiViet);
       return list;
    }
    @GetMapping("/page")
    public Page<BaiViet>page(@RequestParam(defaultValue = "0",value = "page")int page){
        Page<BaiViet>list=baiVietService.page(page);
        return list;
    }
}
