package com.britishgas.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.mvc.AbstractMvcEndpoint;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.britishgas.service.GreetingsService;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MangementGreetingEndPoint extends AbstractMvcEndpoint {

	@Autowired
	private GreetingsService greetingService;

	public MangementGreetingEndPoint() {
		super("internal-greetings", false /* sensitive */);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public GreetingsResponse managementGreetingsResponse() {
		return new GreetingsResponse(greetingService.greet());
	}

	public static class GreetingsResponse {

		@JsonProperty
		private String greetingMessage;

		public GreetingsResponse(String greetingMessage) {
			this.greetingMessage = greetingMessage;
		}
	}
}
