package com.stackroute.Soulmate.service;

import com.stackroute.Soulmate.model.Soulmate;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SoulmateService {
    Soulmate addProfile(Soulmate soulmate);
    Soulmate updateProfile(int id,Soulmate soulmate);
    void deleteProfile(int id);
    List<Soulmate> getAll();

//    @Query("select s from Soulmate s where s.name=?1")
//    List<Soulmate> searchByName(String name);
//    @Query("select s from Soulmate s where s.gender=?1 and s.age=?2")
//    List<Soulmate> searchOnGenderAge(String gender, int age);
}
