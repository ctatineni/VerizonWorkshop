package com.example.userstore;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UerController {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	Application application;
	
	@Value("${customer.name}")
	private String name;
	
	
	
	@RequestMapping("/users")
	public List<User> getListofUsers(){
		log.info("Name is : " + name);
		log.info("app name is : " + application.getName());
		return IteratorUtils.toList(repo.findAll().iterator());
	}

}
