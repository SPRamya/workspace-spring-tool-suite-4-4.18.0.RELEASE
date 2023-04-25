package com.example.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.office.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService seroj;
	@GetMapping("/emp")
	public List<Employee> getAllemployee()
	{
		List<Employee>emplist=seroj.getAllemployee();
		return emplist;
		
	}
	
	
}