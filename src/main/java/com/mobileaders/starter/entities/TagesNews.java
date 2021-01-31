package com.mobileaders.starter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tagsnews")
public class TagesNews {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int TagestoNewsId;

	@Column(name = "news_news_id")
	private int newsId;
	@Column(name =  "tags_news_tagid")
	private int tagId;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	
	
	
	
	
	
	
	
	
	

}
