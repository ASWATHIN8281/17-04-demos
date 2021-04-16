package com.stackroute.Soulmate.service;

import com.stackroute.Soulmate.model.Soulmate;
import com.stackroute.Soulmate.repository.SoulmateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoulmateServiceimpl implements SoulmateService {
    private SoulmateRepository repository;

    @Autowired
    public SoulmateServiceimpl(SoulmateRepository repository) {
        this.repository = repository;
    }

    @Override
    public Soulmate addProfile(Soulmate soulmate) {
        return repository.save(soulmate);
    }

    @Override
    public Soulmate updateProfile(int id,Soulmate soulmate) {

        return repository.save(soulmate);
    }

    @Override
    public void deleteProfile(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Soulmate> getAll() {
        return (List<Soulmate>) repository.findAll();
    }

//    public List<Soulmate> searchByname (String name){
//            return repository.searchByName(name);
//    }
//    public List<Soulmate> searchOngenderAge (String gender,int age){
//            return repository.searchOnGenderAge(gender, age);
//    }

}