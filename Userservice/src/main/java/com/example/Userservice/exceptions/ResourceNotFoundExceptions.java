package com.example.Userservice.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {
	
	public ResourceNotFoundExceptions() {
		super("Resource Not Found on server !!!!!");
	}
	
	public ResourceNotFoundExceptions(String message) {
		super(message);
	}

}
