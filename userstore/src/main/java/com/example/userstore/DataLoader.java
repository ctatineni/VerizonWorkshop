package com.example.userstore;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		//User user = new User(UUID.randomUUID().toString(),"test@test.com","test1");
		User user = new User("test@test.com","test1");
		repo.save(user);
	}

}
