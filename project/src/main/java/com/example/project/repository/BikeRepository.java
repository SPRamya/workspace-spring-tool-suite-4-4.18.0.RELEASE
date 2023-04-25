package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>,CrudRepository<Bike, Integer>{

}
