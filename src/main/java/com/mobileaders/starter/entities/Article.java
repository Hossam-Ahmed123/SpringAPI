package com.mobileaders.starter.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Article implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String conclusion;
	private String media;
	private String link;
	private String author;
	private String guid;
	private String pubdate;
	@Column(name = "newspaperid" ,insertable = false,updatable = false)
	private int newsPaperId;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "likes")
	Set<Users> likes;
	@ManyToOne
	@JoinColumn(name = "newspaperid")
	private Newspaper newsPaper;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "article")
//	private Set<Likes> like;

	public Article() {

	}

	public Article(String title, String conclusion, String media, String link, String author, String guid,
			String pubdate, Newspaper newsPaper) {
		super();
		this.title = title;
		this.conclusion = conclusion;
		this.media = media;
		this.link = link;
		this.author = author;
		this.guid = guid;
		this.pubdate = pubdate;
		this.newsPaper = newsPaper;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	@JsonProperty("Users_Likes")
	public Set<Users> getUsers() {
		return likes;
	}

	public void setUsers(Set<Users> likes) {
		this.likes = likes;
	}

	public int getNewsPaperId() {
		return newsPaperId;
	}

	public void setNewsPaperId(int newsPaperId) {
		this.newsPaperId = newsPaperId;
	}

}
