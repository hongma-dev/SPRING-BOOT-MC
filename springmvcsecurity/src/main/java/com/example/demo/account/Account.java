package com.example.demo.account;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {

	@Id @GeneratedValue
	private Long id;
	private String userName;
	private String pass;
	
	
}
