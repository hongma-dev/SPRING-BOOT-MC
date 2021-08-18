package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception{
		mockMvc.perform(get("/hello").accept(MediaType.TEXT_HTML))
				.andDo(print() )
				.andExpect(status().isOk());
	}
	
	@Test
	public void my() throws Exception{
		mockMvc.perform(get("/my") )
				.andDo(print() )
				.andExpect(status().isOk());
	}
	
}
