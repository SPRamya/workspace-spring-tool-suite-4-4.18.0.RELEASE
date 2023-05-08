package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.bikelogmodel;

@Repository
public interface bikelogrepository extends JpaRepository<bikelogmodel, Integer>{
            bikelogmodel findByUsername(String name);
}
