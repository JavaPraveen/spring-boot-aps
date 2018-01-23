package com.britishgas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		//SpringApplicationBuilder builder = new SpringApplicationBuilder(ApplicationConfiguration.class);
		//builder.child(HelloWorldServiceConfiguration.class).properties("server.port:80");
		SpringApplication.run(MainApplication.class, args);

	}

}
