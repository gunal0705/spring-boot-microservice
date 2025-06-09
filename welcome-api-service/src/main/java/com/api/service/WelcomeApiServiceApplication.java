package com.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WelcomeApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApiServiceApplication.class, args);
	}

}
