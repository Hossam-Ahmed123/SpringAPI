package com.mobileaders.starter.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tags")
public class Tags implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tagid;
	private String tagName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sourceid", nullable = false)
	private Sources sources;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tagsNews")
	Set<Newspaper> news;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "favorites")
	Set<Users> users;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tagsregion")
	Set<Region> region;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "parenttagid", referencedColumnName = "tagid")
	private Tags parent;

	@OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "parenttagid")
	private List<Tags> childrenTags;

	public Tags() {
		// TODO Auto-generated constructor stub
	}

	public int getTagid() {
		return tagid;
	}

	public void setTagid(int tagid) {
		this.tagid = tagid;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Tags> getChildrenTags() {
		return childrenTags;
	}

	public void setChildrenTags(List<Tags> childrenTags) {
		this.childrenTags = childrenTags;
	}
	
	
	

}
