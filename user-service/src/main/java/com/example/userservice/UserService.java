package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public Flux<User> getUsers(){
		return repo.findAll();
	}

}
