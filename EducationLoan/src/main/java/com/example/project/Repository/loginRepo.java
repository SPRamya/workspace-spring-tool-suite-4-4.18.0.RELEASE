package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.login;

@Repository
public interface loginRepo extends JpaRepository<login,Integer> {

}
