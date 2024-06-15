package com.example.Userservice.services;

import java.util.List;

import com.example.Userservice.entities.User;

public interface Userservice {
	
	
	//create
	User saveUser(User user);
	
	//getAllUser
	List<User> getAllUser();
	
	//get user by user id 
	
	User getUser(String userId);

}
