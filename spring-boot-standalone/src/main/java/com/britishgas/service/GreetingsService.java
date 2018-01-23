package com.britishgas.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

	private static final String MGMT_GREETINGS = "Hello Management";

	public String greet() {
		return MGMT_GREETINGS;
	}
}