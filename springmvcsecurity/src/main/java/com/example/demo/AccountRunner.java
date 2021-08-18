package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.account.Account;
import com.example.demo.account.AccountService;

@Component
public class AccountRunner implements ApplicationRunner{

	@Autowired
	AccountService accountService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account hongma = accountService.createAccount("hongma","ghdals12");
		System.out.println(hongma);
		
	}

	
}
