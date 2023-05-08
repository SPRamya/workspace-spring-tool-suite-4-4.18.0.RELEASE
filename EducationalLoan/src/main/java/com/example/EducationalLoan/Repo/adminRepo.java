package com.example.EducationalLoan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.admin;
@Repository
public interface adminRepo extends JpaRepository<admin, String>{

}
