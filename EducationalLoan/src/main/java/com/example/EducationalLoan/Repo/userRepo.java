package com.example.EducationalLoan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.user;
@Repository
public interface userRepo extends JpaRepository<user, Integer> {

}
