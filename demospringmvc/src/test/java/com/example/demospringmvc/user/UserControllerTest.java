package com.example.demospringmvc.user;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc
public class UserControllerTest {

	
	@Autowired
	MockMvc mockMvc;
	
	
	@Test
	public void hello() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect( content().string("hello"))
				.andDo(print())
				;
	}
	
	
	@Test
	public void createUser_JSON() throws Exception {
		
		String userJson = "{\"username\":\"hongma\", \"password\":\"123\"}";
		
		mockMvc.perform(post("/users/createUser")
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.accept(MediaType.APPLICATION_JSON_UTF8)
						.content(userJson))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.username", is(equalTo("hongma"))))
				.andExpect(jsonPath("$.password", is(equalTo("123"))))
				.andDo(print())
				;
	}


	@Test
	public void createUser_XML() throws Exception {
		
		String userJson = "{\"username\":\"hongma\", \"password\":\"123\"}";
		
		mockMvc.perform(post("/users/createUser")
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.accept(MediaType.APPLICATION_XML)
						.content(userJson))
				.andExpect(status().isOk())
				.andExpect(xpath("/User/username").string("hongma"))
				.andExpect(xpath("/User/password").string("123"))
				.andDo(print())
				;
	}
}
