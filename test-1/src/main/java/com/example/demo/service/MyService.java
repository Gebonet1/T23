package com.example.demo.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class MyService {
	
	@GetMapping("/sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return  "Hola:  "+name;
		
	} 
	
	

}
