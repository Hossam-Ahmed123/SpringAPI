package com.mobileaders.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.dto.LoginDto;
import com.mobileaders.starter.entities.dto.SignUpDto;
import com.mobileaders.starter.services.UserService;
import com.mobileaders.starter.services.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	// --- For register
//	localhost:8081/myapp/users
//	{
//        "userName": "ahmed-khaled",
//        "firstName": "Ahmed",
//        "lastName": "Makalad",
//        "email": "Ahmed@yahoo.com",
//        "phoneNumber": "0155555555555555555",
//        "address": "batra",
//        "pswd":"Ahmed123"
//    }

	@RequestMapping("/Register")
	@PostMapping
	public ApiResponse signUp(@RequestBody SignUpDto signUpDto) {
		return userService.signUp(signUpDto);
	}

//    localhost:8081/myapp/users/login
//{   
//    "email": "hossam@gmail.com",
//    "paswd":"123"
//}

	@PostMapping("/login")
	public ApiResponse login(@RequestBody LoginDto loginDto) {
		return userService.login(loginDto);
	}

}
