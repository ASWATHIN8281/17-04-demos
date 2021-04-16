package com.stackroute.Soulmate.repository;

import com.stackroute.Soulmate.model.Soulmate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoulmateRepository extends CrudRepository<Soulmate,Integer> {
//    @Query("select s from Soulmate s where s.name=?1")
//    List<Soulmate> searchByName(String name);
//    @Query("select s from Soulmate s where s.gender=?1 and s.age=?2")
//    List<Soulmate> searchOnGenderAge(String gender, int age);
}
