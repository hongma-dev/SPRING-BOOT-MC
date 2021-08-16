package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "accoutns")
@Data
public class Account {

	@Id
	private String id;
	
	private String userName;
	private String email;
	
}
