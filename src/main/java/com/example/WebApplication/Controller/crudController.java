package com.example.WebApplication.Controller;

import com.example.WebApplication.Model.StudDetails;
import com.example.WebApplication.Services.crudService;
import com.example.WebApplication.Services.crudJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class crudController {

    @Autowired
    crudService cr;
    @Autowired
    crudJpaService crJs;


    @GetMapping("/")
    public String greet() {
        return "Welcome Students";
    }

    @GetMapping("/all")
    public List<StudDetails> getAllRecords() {
        return crJs.studData();
    }

    @GetMapping("/{id}")
    public StudDetails getRecordByID(@PathVariable int id) {
        return crJs.getStudId(id);
    }

    @PostMapping("/add")
    public String addStud(@RequestBody StudDetails st) {
        return crJs.addStudents(st);
    }

    @PutMapping("/update")
    public String updateStud(@RequestBody StudDetails st) {
        return crJs.updStud(st);
    }

    @DeleteMapping("/delete/{id}")
    public String delStud(@PathVariable int id) {
        return crJs.deleteStud(id);
    }

    @GetMapping("/key/{key}")
    public List<StudDetails> getByKey(@PathVariable String key) {
        return crJs.getByKey(key);
    }

    @GetMapping("/load")
    public String loadData(){
        return cr.load();
    }
}
