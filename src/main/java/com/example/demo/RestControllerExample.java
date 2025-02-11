package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	
	@GetMapping("/")
	public String getMessage()
	{
		System.out.println("Rest ApI called ");
		return "<h2><font color='green'>Welcome Mr ."+new Date()+"</font></h2>";
	}
	
	
       @GetMapping("/{name}")
	public String getName(@PathVariable String name)
	{
		System.out.println("Rest ApI called ");
		return "<h2><font color='green'>Welcome Mr ."+name+"</font></h2>";
	}
}
