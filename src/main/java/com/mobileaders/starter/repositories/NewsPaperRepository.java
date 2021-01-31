package com.mobileaders.starter.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobileaders.starter.entities.Newspaper;

public interface NewsPaperRepository extends CrudRepository<Newspaper, Integer> {
	@Query(value = "SELECT n FROM Newspaper n WHERE n.newsId IN :ids")
	List<Newspaper> findUserByNameList(@Param("ids") Collection<Integer> ids);

	
	@Query(value = "SELECT n FROM Newspaper n WHERE n.newsId IN :ids")
	List<Newspaper> findNewsForTagesList(@Param("ids") Collection<Integer> ids);

	
	
	
	
	
	
}