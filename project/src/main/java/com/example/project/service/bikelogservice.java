package com.example.project.service;
import com.example.project.model.bikelogmodel;
import com.example.project.repository.bikelogrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class bikelogservice{

@Autowired
private bikelogrepository lrepo;
public String checkLogin(String username,String psword)
{
	bikelogmodel user= lrepo.findByUsername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(psword))
		{
			return "Login Succesfull";
		}
		else
		{
			return "Login Failed";
		}
	}
} 
public bikelogmodel addUser(bikelogmodel cl)
{
	return lrepo.save(cl);
}
public List<bikelogmodel> getUser()
{
	return lrepo.findAll();
}
public bikelogmodel putUser(bikelogmodel cl)
{
	return lrepo.save(cl);
}
}