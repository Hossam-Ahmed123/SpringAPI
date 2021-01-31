package com.mobileaders.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileaders.starter.entities.Users;

public interface UserDao extends JpaRepository<Users, Integer> {

	Users findByUserName(String userName);

	Users findByEmail(String email);
}
