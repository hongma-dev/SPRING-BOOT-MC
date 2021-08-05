package com.example.springmvcthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SamepleController {

	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","hongma");
		
		return "hello";
	}
	
	@GetMapping("/exception")
	public String exception() throws SampleException {
		throw new SampleException();
	}
	
	
	@ExceptionHandler(SampleException.class)
	public @ResponseBody AppError sampleError(SampleException e) {
		AppError appError = new AppError();
		appError.setMessage("error.app.key");
		appError.setReason("IDX IS NOT NOT NOT ");
		return appError;
	}
	
}
