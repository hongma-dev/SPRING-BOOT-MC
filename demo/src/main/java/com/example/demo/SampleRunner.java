package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class SampleRunner implements ApplicationRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	HongmaProperties prop;
	
	@Autowired
	private String hello;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("============================");
		logger.debug("test");
		logger.debug("============================");
		
//		System.out.println("============================");
//		System.out.println("name : "+prop.getName());
//		System.out.println("hello : "+hello);
//		System.out.println("============================");
	}

}
