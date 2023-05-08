package com.example.EducationalLoan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.login;
@Repository
public interface loginRepo extends JpaRepository<login, String> {

}
