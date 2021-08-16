package com.example.demo.account;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@RedisHash("accounts")
@Data
public class Account {
	
	@Id 
	private String id;
	
	private String username;
	private String email;
	
}
