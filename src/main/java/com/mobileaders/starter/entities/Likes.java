package com.mobileaders.starter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(name = "likes", uniqueConstraints = @UniqueConstraint(columnNames = { "articles_id", "likes_user_id" }))

@Entity
public class Likes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int likeid;

	@Column(name = "articles_id")
	private int articleId;

	@Column(name = "likes_user_id")
	private int userId;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
