package com.example.Userservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Userservice.entities.User;
import com.example.Userservice.exceptions.ResourceNotFoundExceptions;
import com.example.Userservice.repositories.UserRepository;
import com.example.Userservice.services.Userservice;

@Service
public class UserServiceImpl implements Userservice {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		System.out.println("name-----UserServiceImpl"+user.getName());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		
		System.out.println("userId-----UserServiceImpl"+userRepository.findById(userId));
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundExceptions("user with given id is not found on server" +userId));
	}

}
