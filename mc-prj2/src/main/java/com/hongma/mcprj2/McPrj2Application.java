package com.hongma.mcprj2;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class McPrj2Application {

	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(McPrj2Application.class, args);
	}
	
	@Bean
	public ServletWebServerFactory serverFactory() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector());
		return tomcat;
	}
	
	public Connector createStandardConnector () {
		Connector connector = new Connector();
		connector.setPort(8080);
		return connector;
	}

}
