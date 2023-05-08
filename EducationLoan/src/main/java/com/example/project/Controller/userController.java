package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.login;
import com.example.project.Model.user;
import com.example.project.Service.userService;
@RestController
public class userController {
	@Autowired
	userService pservice;
	@PostMapping("/userLogin")
	public String validateUser(@RequestBody login logindata)
	{
		return pservice.ValidateUser(logindata.getEmail(),logindata.getPassword());
	}
	@PostMapping("/usersignup")
	public user newUser(@RequestBody user user)
	{
		return pservice.postuser(user);
	}
	 @GetMapping("/getProfile")
	  public List<user> getAlluser()
	  {
		  List<user>userlist=pservice.getAlluser();
		  return userlist;
	  }
	
	@PostMapping("/postProfile")
	public user addPerson(@RequestBody user p)
	{
		return pservice.postuser(p);
	}
	@PutMapping("/putProfile")
	public user updateData(@RequestBody user b,@RequestParam int id)
	{
		b.setId(id);
		return pservice.updateInfo(b);
	}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int id)
	{
		pservice.deleteInfo(id);
		return "Deleted Successfully";
	}
	@GetMapping("/getProfile/{UserRole}")
	public List<user>fetchbyuser(@PathVariable String UserRole)
	{
		return pservice.fetchbyuser(UserRole);
	}
	}