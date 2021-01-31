package com.mobileaders.starter.services;

import com.mobileaders.starter.controller.ApiResponse;
import com.mobileaders.starter.entities.dto.LoginDto;
import com.mobileaders.starter.entities.dto.SignUpDto;

public interface UserService {

	 ApiResponse signUp(SignUpDto signUpDto);
	 ApiResponse login(LoginDto loginDto);
	 
	 
	 
	
}
