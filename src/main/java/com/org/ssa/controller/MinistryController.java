package com.org.ssa.controller;

import com.org.ssa.model.Ministry;
import com.org.ssa.service.MinistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MinistryController {

    @Autowired
    MinistryService ministryService;

    @PostMapping("/create")
    public void createMinistry(@RequestBody Ministry ministry){
        ministryService.createMinistry(ministry);

    }
    @GetMapping("/getAll")
    public List<Ministry>  getAllministry(@RequestBody Ministry ministry){
        List<Ministry> manju  = ministryService.getAllministry(ministry);
        return manju;
    }

    @DeleteMapping("/deleteBYId/{id}")
    public String deleteById(@PathVariable Integer id){
        String m=ministryService.deleteById(id);
        return m;
    }

    @DeleteMapping("/deleteByName/{name}")
    public String deleteByName(@PathVariable String name){
        String S=ministryService.deleteByName(name);
        return S;
    }
    @PostMapping("/salaryDouble/{address}")
    public String salaryDouble(@PathVariable String address){
        String ma=ministryService.salaryDouble(address);
        return ma;
    }
}

