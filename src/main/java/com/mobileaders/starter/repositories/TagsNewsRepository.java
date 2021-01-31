package com.mobileaders.starter.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobileaders.starter.entities.TagesNews;

@Repository
public interface TagsNewsRepository extends CrudRepository<TagesNews, Integer> {

	 List<TagesNews> findAllBytagId(int tagId);

}
