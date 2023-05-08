package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Model.user;

@Repository
public interface userRepo extends JpaRepository<user, Integer>{
	 
	user findByUsername(String email);
	@Query("select s from user s where s.UserRole=?1")
	public List<user>fetchbyuser(String UserRole);
}
