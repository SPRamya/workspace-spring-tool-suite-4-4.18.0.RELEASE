package com.example.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.admin;
import com.example.project.Repository.adminRepo;



@Service
public class adminService 
{
	@Autowired
	adminRepo prepo;
	public List<admin> getAdmin()
	{
		return prepo.findAll();
	}
	public admin postadmin(admin p)
	{
		return prepo.save(p);
	}

}
