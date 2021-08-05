package com.example.springmvcthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SamepleController {

	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","hongma");
		
		return "hello";
	}
}
