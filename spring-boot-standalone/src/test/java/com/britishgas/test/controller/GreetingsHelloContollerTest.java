package com.britishgas.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.britishgas.test.GreentingsTest;

public class GreetingsHelloContollerTest extends GreentingsTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMVC;

	@Before
	public void setup() {
		mockMVC = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testHelloWorldGreetings() throws Exception {
		mockMVC.perform(get("/greetings")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.greeting").value("Hello World"));

	}

}
