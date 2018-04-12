package com.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {
	
	@Autowired
	GatewayService service;
	
	@LoadBalanced
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
	
	@RequestMapping("/users")
	public String getUsers() {
		return service.getUsers();
	}

}
