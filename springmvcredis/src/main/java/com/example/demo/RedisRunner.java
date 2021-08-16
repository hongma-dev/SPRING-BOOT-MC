package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.example.demo.account.Account;
import com.example.demo.account.AccountRepository;

@Component
public class RedisRunner implements ApplicationRunner {
	
	
	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	AccountRepository repository;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		ValueOperations<String,String > values = redisTemplate.opsForValue();
		values.set("hongma","kimhongmin");
		values.set("springboot","2.0");
		values.set("한글","안녕하세요");
		
		
		Account account = new Account();
		account.setEmail("hmkim@redsoft.co.kr");
		account.setUsername("hongma");
		
		repository.save(account);
		
		Optional<Account> byId = repository.findById(account.getId());
		System.out.println(byId.get().getUsername());
		System.out.println(byId.get().getEmail());
		
		
	}
	
	
}
