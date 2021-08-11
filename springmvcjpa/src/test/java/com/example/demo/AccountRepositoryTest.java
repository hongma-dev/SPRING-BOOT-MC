package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.account.Account;
import com.example.demo.account.AccountRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Test
	public void id() throws SQLException {
		
		Account account = new Account();
		account.setUserName("hongma");
		account.setPassword("pass");
		
		Account newAccount = accountRepository.save(account);
		
		assertThat(newAccount).isNotNull();
		
		Optional<Account> exam = accountRepository.findByUserName(newAccount.getUserName());
		assertThat(exam).isNotEmpty();
		
		Optional<Account> non_exam = accountRepository.findByUserName("kims");
		assertThat(non_exam).isEmpty();
	}
	
	
}
