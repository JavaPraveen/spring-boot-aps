package com.britishgas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.britishgas.service.GreetingsService;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public GreetingsService greetingsService() {
		return new GreetingsService();
	}

}
