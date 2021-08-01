package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	
	@Autowired
	HongmaProperties prop;
	
	@GetMapping("/hello")
	public String hello () {
		
		System.out.println("name : "+ prop.getName());
		System.out.println("age : "+ prop.getAge());
		
		return "hello";
	}
}
