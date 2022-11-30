package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/home")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/bye")
	public String bye() {
		System.out.println("test build");
		return "Bye World";
	}
}
