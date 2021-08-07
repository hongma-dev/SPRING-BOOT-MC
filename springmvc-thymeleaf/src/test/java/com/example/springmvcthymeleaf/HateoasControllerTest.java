package com.example.springmvcthymeleaf;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@AutoConfigureMockMvc
public class HateoasControllerTest {

	
	@Autowired
	MockMvc mockMvc;
	
	
	@Test
	public void smaple01() throws Exception{
		mockMvc.perform(get("/smaple01"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$._links.self").exists())
				;
	}

}
