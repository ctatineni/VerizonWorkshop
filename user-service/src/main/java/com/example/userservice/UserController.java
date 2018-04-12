package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class UserController {
	
	@Autowired
	UserService svc;
	
	@GetMapping("/users")
	public Flux<User> getListofUsers(){
		return svc.getUsers();
	}

}
