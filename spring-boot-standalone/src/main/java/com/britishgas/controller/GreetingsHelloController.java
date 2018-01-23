package com.britishgas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsHelloController {

	private static final String HELLO_WORLD = "Hello World";

	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public String greeting() {
		return HELLO_WORLD;
	}

}
