package com.mobileaders.starter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Table(name = "follow",
uniqueConstraints=
    @UniqueConstraint(columnNames={"news_paper_news_id", "users_follow_user_id"}))
@Entity
public class Follow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int follow_id;

	@Column(name = "news_paper_news_id")
	private int newspaperId;

	@Column(name = "users_follow_user_id")
	private int userId;

	public int getNewspaperId() {
		return newspaperId;
	}

	public void setNewspaperId(int newspaperId) {
		this.newspaperId = newspaperId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
