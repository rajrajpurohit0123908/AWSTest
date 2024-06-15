package com.example.Userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Userservice.entities.User;
import com.example.Userservice.services.Userservice;

@RestController
@RequestMapping("/users")
public class UserController {
	
	 @Autowired(required=true)
	 private Userservice userservice;
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		System.out.println("name-----UserController"+user.getName());
		
		User user1 =  userservice.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	@GetMapping("/{userID}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userID){
		
		User user = userservice.getUser(userID);
		return ResponseEntity.ok(user);
		
	}
	
	 @GetMapping
	    public ResponseEntity<List<User>> getAllUser(){
	        List<User> allUser = userservice.getAllUser();
	        return ResponseEntity.ok(allUser);
	    }
	
	
	
	

}
