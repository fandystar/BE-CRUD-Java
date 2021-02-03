package com.example.testSpring.controller;

import com.example.testSpring.model.SiswaModel;
import com.example.testSpring.payload.SiswaPayload;
import com.example.testSpring.repo.SiswaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siswa")
public class SiswaController {
    
    @Autowired
    SiswaRepo siswaRepo ;
    
    @PostMapping("/create")
    public SiswaModel create(@RequestBody SiswaPayload siswaPayload) {
        SiswaModel siswaModel = new SiswaModel(siswaPayload.getName()) ; 
        siswaModel  = siswaRepo.save(siswaModel);
        return siswaModel;
    }


}
