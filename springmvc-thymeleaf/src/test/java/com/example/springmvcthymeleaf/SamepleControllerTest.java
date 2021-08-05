package com.example.springmvcthymeleaf;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SamepleController.class)
@AutoConfigureMockMvc
public class SamepleControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception{
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andDo(print())
				.andExpect(view().name("hello"))
				.andExpect(model().attribute("name", is("hongma")))
				.andExpect(content().string(containsString("hongma")))
				;
	}
}
