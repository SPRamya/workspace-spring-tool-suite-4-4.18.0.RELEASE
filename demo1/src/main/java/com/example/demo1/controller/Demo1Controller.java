package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo1Controller {
	@ResponseBody
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String abc()
	{
		return "I am ramya";
	}
	@ResponseBody
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String dcg()
	{
		return "I am sp";
	}

}
