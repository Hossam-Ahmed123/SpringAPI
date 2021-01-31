package com.mobileaders.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.Article;
 import com.mobileaders.starter.errors.ResourceNotFoundException;
import com.mobileaders.starter.services.ArticleService;

@RestController
public class ArticleControler {

	@Autowired
	private ArticleService articleService;

//	localhost:8081/myapp/allArticlebyNews

 	@RequestMapping("/allArticle")
	public List<Article> allArticlebyNews() {

		return articleService.allArticles();

	}

//	localhost:8081/myapp/allArticlebyNews/23
	@ExceptionHandler(ResourceNotFoundException.class)
	@RequestMapping(path = "/allArticlebyNews/{newsId}", method = RequestMethod.GET)
	public List<Article> getAllfavoarateUser(@PathVariable int newsId) {
		return articleService.allArticlesByNewsId(newsId);
	}

}
