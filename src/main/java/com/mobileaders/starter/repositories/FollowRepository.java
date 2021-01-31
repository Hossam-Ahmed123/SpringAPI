package com.mobileaders.starter.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobileaders.starter.entities.Follow;

public interface FollowRepository extends CrudRepository<Follow, Integer> {
	List<Follow> findAllByuserId(int userId);

}
