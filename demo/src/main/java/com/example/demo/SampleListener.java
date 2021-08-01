package com.example.demo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent>{

//	@Value("${hongma.name}")
//	private String name;
	
//	@Override
//	public void onApplicationEvent(ApplicationStartingEvent event) {
//		System.out.println("========================");
//		System.out.println("Application is Starting");
//		System.out.println("========================");
//	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		
		System.out.println("========================");
		System.out.println("Application is Started");
//		System.out.println("name : "+name);
//		System.out.println("name : "+ properties.getName());
		System.out.println("========================");
		
	}

}
