package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
