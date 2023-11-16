package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.ChuDe;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.service.ChuDeService;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chu-de")
public class ChuDeController {
@Autowired
    ChuDeService chuDeService;
@GetMapping("/hienthi")
    public List<ChuDe>getAll(){
    List<ChuDe>list=chuDeService.getAll();
    return list;
}
@PostMapping("/insert")
    public Respon<ChuDe> insert(@RequestBody ChuDe chuDe){
  Respon<ChuDe>respon= chuDeService.insert(chuDe);
    return respon;
}
@PutMapping("/update/{chuDeID}")
    public String update(@PathVariable("chuDeID")int id,@RequestBody ChuDe chuDe){
    chuDeService.update(chuDe,id);
    return "Thành công";
}
@DeleteMapping("/delete/{chuDeID}")
    public String delete(@PathVariable("chuDeID")int id){
    chuDeService.delete(id);
    return "Thành công";
}
@GetMapping("/page")
    public Page<ChuDe> page(@RequestParam(defaultValue = "0",value = "page")int page){
    Page<ChuDe>list=chuDeService.page(page);
    return list;
}
}
