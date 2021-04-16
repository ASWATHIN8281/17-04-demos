package com.stackroute.Soulmate.controller;

import com.stackroute.Soulmate.model.Soulmate;
import com.stackroute.Soulmate.service.SoulmateServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SoulmateController {
    private SoulmateServiceimpl service;

    @Autowired
    public SoulmateController(SoulmateServiceimpl service) {
        this.service = service;
    }
    @PostMapping("/soulmate")
    public ResponseEntity<Soulmate>addSoulmate(@RequestBody Soulmate soulmate){
        return new ResponseEntity<Soulmate>(service.addProfile(soulmate),HttpStatus.CREATED);
    }
    @PutMapping("/soulmate/{id}")
    public ResponseEntity<Soulmate>updateSoulmate(@RequestBody Soulmate soulmate,@PathVariable int id){
        return new ResponseEntity<Soulmate>(service.updateProfile(id,soulmate),HttpStatus.OK);
    }
    @DeleteMapping("/soulmate")
    public void deleteSoulmate(@RequestBody Soulmate s){
        service.deleteProfile(s.getId());
    }
//    @GetMapping("/soulmate")
//    public List<Soulmate> getByName(@RequestBody Soulmate s){
//        return (List<Soulmate>)service.searchByname(s.getName());
//    }
//    @GetMapping("/soulmate/{age}/{gender}")
//    public List<Soulmate> getByGenderAge(@PathVariable int age,String gender){
//        return (List<Soulmate>)service.searchOngenderAge(gender,age);
//    }
    @GetMapping
    public List<Soulmate>getAllSoulmate(){
        return (List<Soulmate>)service.getAll();
    }
}
