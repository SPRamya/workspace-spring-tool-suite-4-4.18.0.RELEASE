package com.example.EducationalLoan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.application;
@Repository
public interface applicationRepo extends JpaRepository<application, Integer>{

}
