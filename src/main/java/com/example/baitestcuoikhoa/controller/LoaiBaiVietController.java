package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.LoaiBaiViet;
import com.example.baitestcuoikhoa.repository.LoaiBaiVietRepository;
import com.example.baitestcuoikhoa.service.LoaiBaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loai-bai-viet")
public class LoaiBaiVietController {
    @Autowired
    LoaiBaiVietService loaiBaiVietService;
    @GetMapping("/hienthi")
    public List<LoaiBaiViet>getAll(){
        List<LoaiBaiViet>list=loaiBaiVietService.getAll();
        return list;
    }

    @PostMapping("/insert")
    public String insert(@RequestBody LoaiBaiViet loaiBaiViet){
        loaiBaiVietService.insert(loaiBaiViet);
        return "Thành công";
    }
    @PutMapping("/update/{loaiBaiVietID}")
    public String update(@PathVariable("loaiBaiVietID")int id,@RequestBody LoaiBaiViet loaiBaiViet){
        loaiBaiVietService.update(loaiBaiViet,id);
        return "Thành công";
    }
    @DeleteMapping("/delete/{loaiBaiVietID}")
    public String delete(@PathVariable("loaiBaiVietID")int id){
        loaiBaiVietService.delete(id);
        return "Thành công";
    }
    @GetMapping("/page")
    public Page<LoaiBaiViet> page(@RequestParam(defaultValue = "0",value = "page")int page){
        Page<LoaiBaiViet>list=loaiBaiVietService.page(page);
        return list;
    }
}
