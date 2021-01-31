package com.mobileaders.starter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileaders.starter.entities.Article;
import com.mobileaders.starter.entities.Newspaper;
import com.mobileaders.starter.repositories.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository repository;

	public List<Article> allArticles() {

		List<Article> articleList = new ArrayList<>();

		repository.findAll().forEach(articleList::add);

		return articleList;

	}

	public List<Article> allArticlesByNewsId(int newsId) {
		List<Article> articleList = new ArrayList<>();

		repository.newsPaperId(newsId).forEach(articleList::add);

		return articleList;
	}

}
