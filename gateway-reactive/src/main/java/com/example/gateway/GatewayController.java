package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class GatewayController {
	
	@GetMapping("/users")
	public Mono<String> getUsers() {
		WebClient client = WebClient.create("http://localhost:8081");
		return client.get().uri("/users").retrieve().bodyToMono(String.class);
	}

}
