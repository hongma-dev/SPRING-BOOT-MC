package com.example.TesterPRJ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("hello")
	public String hello() {
		
		
		logger.info("hongma-man");
		logger.info("Let's go BattleGround");
		
		
		return "hello "+sampleService.getName();
		
	}
}
