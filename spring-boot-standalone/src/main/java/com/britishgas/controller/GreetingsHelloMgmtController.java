package com.britishgas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.britishgas.model.MangementGreetingEndPoint;
import com.britishgas.service.GreetingsService;

@RestController
public class GreetingsHelloMgmtController {

	private static final String HELLO_MGMT = "Hello Management";

	@RequestMapping(value = "/internal-greetings", method = RequestMethod.GET)
	public String greeting() {
		return new GreetingsService().greet();
	}

}
