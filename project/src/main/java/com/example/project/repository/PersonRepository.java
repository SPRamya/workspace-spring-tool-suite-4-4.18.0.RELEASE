package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {

}
