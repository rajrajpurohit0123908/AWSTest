package com.example.Userservice.payload;

import org.springframework.http.HttpStatus;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
	
	private String message;
	private boolean sucess;
	private HttpStatus status;

}
