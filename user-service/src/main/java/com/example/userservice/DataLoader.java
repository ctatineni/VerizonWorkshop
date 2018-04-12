package com.example.userservice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class DataLoader{
	
	@Autowired
	UserRepository repo;

	@PostConstruct
	public void loadData() {
		repo.deleteAll().thenMany(Flux.just("test","test1")
				.zipWith(Flux.just("123-456-7890","987-654-3210"),User::new)
				.flatMap(repo::save))
		        .subscribe(System.out::println);
		
	}

}
