package com.example.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
	@GetMapping("/view")
	public String view(@RequestParam String username)
	{
		return "I am in userpage "+username;
	}
	@GetMapping("/check")
public String sec(@RequestParam String name,@RequestParam String pass)
{
	if(name.equals("admin")&& pass.equals("12345"))
	{
		return "Login successfully";
	}
	else
	{
		return "Login failed";
	}
}
}
