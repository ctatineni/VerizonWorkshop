package com.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GatewayService {
	
	@Autowired
	RestTemplate template;
	
	@HystrixCommand(fallbackMethod="fallback")
	public String getUsers() {
		return template.getForEntity("http://user/users", String.class).getBody();
	}

	public String fallback(){
		return "please try again later";
	}
	

}
