package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Bike;
import com.example.project.service.ProjectService;

@RestController
public class BikeController {
  @Autowired
  
  public ProjectService serobj;
  @PostMapping("/post")
  public Bike addDetails(@RequestBody Bike obj)
  {
	  return serobj.saveInfo(obj);
  }
  
  @GetMapping("/get")
  public List<Bike> getAllbike()
  {
	  List<Bike>bikelist=serobj.getAllbike();
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
}



