package com.mobileaders.starter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Table(name = "favorites",
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"tages_tagid", "users_user_id"})
	)
@Entity
public class Favorites {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int favoritesId;

	@Column(name = "tages_tagid")
	private int tagID;

	@Column(name = "users_user_id")
	private long userId;

	public int getTagID() {
		return tagID;
	}

	public void setTagID(int tagID) {
		this.tagID = tagID;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
