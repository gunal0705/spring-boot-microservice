package com.api.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	@GetMapping("/welcome")
	public String getWecomeMsg() {
		return "Welcome to Microservice";
	}
}
