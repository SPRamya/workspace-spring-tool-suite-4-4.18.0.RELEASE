package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/h")
	public String abc()
	{
		return "I am SPRamya";
	}

}
