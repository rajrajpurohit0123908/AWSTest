package com.example.Userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Userservice.entities.User;

public interface UserRepository extends JpaRepository<User,String> {
	
	

}
