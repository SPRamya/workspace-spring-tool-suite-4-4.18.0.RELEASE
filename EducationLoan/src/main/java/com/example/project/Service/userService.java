package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.Model.user;
import com.example.project.Repository.applicationRepo;
import com.example.project.Repository.userRepo;
@Service
public class userService {
	@Autowired
	userRepo prepo;
	@Autowired
	userRepo repobj;
	@Autowired
	applicationRepo lobj;
	public String ValidateUser(String email,String password)
	{
		user u=repobj.findByUsername(email);
		if(u==null)
		{
			return "No User Found";
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return "Login Successfull";
			}
			else
			{
				return "Login Falied";
			}
		}
	}
	public List<user> getAlluser()
	{
		List<user> userList=prepo.findAll();
		return userList;
		
	}
	public user postuser(user p) {
		return prepo.save(p);
	}
	public user updateInfo( user obj1)
	{
		return prepo.save(obj1);
	}
	public void deleteInfo(int id)
	{
		prepo.deleteById(id);
	}
	public List<user> fetchbyuser(String UserRole)
	{
		return prepo.fetchbyuser(UserRole);
	}
	
}
