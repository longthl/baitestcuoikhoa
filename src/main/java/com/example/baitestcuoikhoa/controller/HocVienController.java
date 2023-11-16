package com.example.baitestcuoikhoa.controller;

import com.example.baitestcuoikhoa.model.HocVien;
import com.example.baitestcuoikhoa.model.respon.Respon;
import com.example.baitestcuoikhoa.service.HocVienService;
import org.aspectj.lang.annotation.AdviceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoc-vien")
public class HocVienController {
    @Autowired
            HocVienService hocVienService;
@GetMapping("/hienthi")
    public List<HocVien> hienthi(){
    List<HocVien>list=hocVienService.getAll();
    return list;
}
@PutMapping("/update/{id}")
    public String update(@PathVariable("id")int id,@RequestBody HocVien hocVien){
    hocVienService.capnhat(hocVien,id);
    return "thành công";
}
@PostMapping("/them")
    public Respon<HocVien> them(@RequestBody HocVien hocVien){
   Respon<HocVien>respon= hocVienService.insert(hocVien);
    return respon;
}
@DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id){
    hocVienService.delete(id);
    return "Thành công";
}
@GetMapping("/timkiem/{key}")
    public List<HocVien> timkiem(@PathVariable("key") String key){
   List<HocVien>list= hocVienService.timkiemtenandemail(key);
 return list;
}
@GetMapping("/phantrang")
    public Page<HocVien> phantrang(@RequestParam(defaultValue = "0",value = "page")int page){
    Page<HocVien> hv=hocVienService.phantrang(page);
    return hv;
}
}
