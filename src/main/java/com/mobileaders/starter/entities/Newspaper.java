package com.mobileaders.starter.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "newspaper")

public class Newspaper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newsId;
	private String datePosted;
	@Column(name = "newstitle", unique = true)
	private String newsTitle;
	private String newsConclosion;
	private String dateUpdated;
	private String newsStatus;
	private String commentStatus;
	private String newsLink;

//
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "newsPaper")
	private Set<Article> article;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "follow")
	private Set<Users> usersFollow;
	@ManyToMany(mappedBy = "news")
	private Set<Tags> tagsNews;

	@JsonProperty("Users_Follow")
	public Set<Users> getUsers() {
		return usersFollow;
	}

	public void setUsers(Set<Users> usersFollow) {
		this.usersFollow = usersFollow;
	}

	public Newspaper() {

	}

	public Newspaper(String datePosted, String newsTitle, String newsConclosion, String dateUpdated, String newsStatus,
			String commentStatus, String newsLink) {
		super();

		this.datePosted = datePosted;
		this.newsTitle = newsTitle;
		this.newsConclosion = newsConclosion;
		this.dateUpdated = dateUpdated;
		this.newsStatus = newsStatus;
		this.commentStatus = commentStatus;
		this.newsLink = newsLink;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public long getNewsId() {
		return newsId;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsConclosion() {
		return newsConclosion;
	}

	public void setNewsConclosion(String newsConclosion) {
		this.newsConclosion = newsConclosion;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getNewsStatus() {
		return newsStatus;
	}

	public void setNewsStatus(String newsStatus) {
		this.newsStatus = newsStatus;
	}

	public String getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getNewsLink() {
		return newsLink;
	}

	public void setNewsLink(String newsLink) {
		this.newsLink = newsLink;
	}

}
