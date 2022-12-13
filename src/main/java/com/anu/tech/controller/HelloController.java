package com.anu.tech.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anu.tech.util.MessageUtility;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@GetMapping("/message")
	public String getHello(@RequestParam String name)
	{
		return "Hello "+name+" "+MessageUtility.getWishMessage();
	}

}
