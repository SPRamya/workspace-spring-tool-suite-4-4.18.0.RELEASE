package com.example.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.office.model.EmployeeModel;
import com.example.office.service.EmployeeService;
import com.example.project.model.Bike;
import com.example.project.service.ProjectService;

@RestController
public class EmployeeController {
  @Autowired
  
  public EmployeeService serobj;
  @PostMapping("/post")
  public em addDetails(@RequestBody em obj)
  {
	  return serobj.saveInfo(obj);
  }
  
  @GetMapping("/get")
  public List<EmployeeModel> getAllbike()
  {
	  List<EmployeeModel>bikelist=serobj.getAllEmployee();
	  return bikelist;
  }
@PutMapping("/put")
public Bike updateData(@RequestBody Bike b,@RequestParam int id)
{
	b.setId(id);
	return serobj.updateInfo(b);
}
@DeleteMapping("/delete")
public String deleteData(@RequestParam int id)
{
	serobj.deleteInfo(id);
	return "Deleted Successfully";
}
//
}



