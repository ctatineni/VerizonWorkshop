package com.example.userservice;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class User {
	
	private String id;
	@NonNull
	private String name;
	@NonNull
	private String phonenumber;

}
