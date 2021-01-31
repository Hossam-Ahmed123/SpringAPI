package com.mobileaders.starter.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobileaders.starter.entities.Likes;

public interface LikesRepository extends CrudRepository<Likes, Long> {

}
