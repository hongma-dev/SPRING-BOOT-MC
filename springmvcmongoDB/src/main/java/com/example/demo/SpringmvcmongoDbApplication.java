package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringmvcmongoDbApplication {

	
	@Autowired
	MongoTemplate tem;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcmongoDbApplication.class, args);
	}

	
	
	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			Account ac = new Account();
			ac.setEmail("hmkim@redsoft.co.kr");
			ac.setUserName("hongma");
			
			tem.insert(ac);
			
			System.out.println("finished");
		};
	}
}
