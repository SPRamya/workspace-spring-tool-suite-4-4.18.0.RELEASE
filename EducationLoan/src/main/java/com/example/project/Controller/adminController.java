package com.example.project.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.admin;
import com.example.project.Service.adminService;




@RestController
public class adminController {

	@Autowired
	adminService pservice;
	
	
	@GetMapping("/getAdmin")
	public List<admin> findAll()
	{
		return pservice.getAdmin();
	}
	
	@PostMapping("/postAdmin")
	public admin addPerson(@RequestBody admin p)
	{
		return pservice.postadmin(p);
	}
	
}







