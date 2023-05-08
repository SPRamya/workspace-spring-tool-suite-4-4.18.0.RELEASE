package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.project.Model.ex;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<ex,Integer> {

}
