package com.mobileaders.starter.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileaders.starter.controller.ApiResponse;
import com.mobileaders.starter.entities.Users;
import com.mobileaders.starter.entities.dto.LoginDto;
import com.mobileaders.starter.entities.dto.SignUpDto;
import com.mobileaders.starter.repositories.UserDao;
import com.mobileaders.starter.repositories.UserDaoImpl;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Override
	public ApiResponse signUp(SignUpDto signUpDto) {
		validateSignUp(signUpDto);
		Users user = new Users();
		// can use Bcrypt
		BeanUtils.copyProperties(signUpDto, user);
		userDaoImpl.save(user);
		return new ApiResponse(200, "success", user);
	}

	@Override
	public ApiResponse login(LoginDto loginDto) {
		Users user = userDao.findByEmail(loginDto.getEmail());
		if (user == null) {
			throw new RuntimeException("User does not exist.");
		}
		if (!user.getPswd().equals(loginDto.getPaswd())) {
			System.out.println("------------------" + user.getPswd() + "-----------------");
			System.out.println("------------------" + loginDto.getPaswd() + "-----------------");

			throw new RuntimeException("Password mismatch.");
		}
		return new ApiResponse(200, "Login success", null);

	}

	private void validateSignUp(SignUpDto signUpDto) {
	}

}
