package com.mobileaders.starter.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobileaders.starter.entities.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

//	 List<Article> getAllArticlesByNews(int newsPaperId);

	List<Article> newsPaperId(int newsPaperId);

}
