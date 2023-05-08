package com.example.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.service.bikelogservice;
import com.example.project.model.bikelogmodel;
@RestController
@RequestMapping("/user")
public class bikelogcontroller {
	
	@Autowired
	private bikelogservice lser;
	
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	@PutMapping("/put")
	public bikelogmodel putUser(@RequestBody bikelogmodel cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/adduser")
	public bikelogmodel AddUser(@RequestBody bikelogmodel cl)
	{
		return lser.addUser(cl);
	}
	
	@GetMapping("/showall")
	public List<bikelogmodel> listAll()
	{
		return lser.getUser();
	}
}