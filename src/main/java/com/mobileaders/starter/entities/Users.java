package com.mobileaders.starter.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	@Column(name = "user_name", unique = true)

	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;
	private String pswd;
	@ManyToMany(mappedBy = "likes")
	private Set<Article> articles;

	@ManyToMany(mappedBy = "users")
	private Set<Tags> tages;
	@ManyToMany(mappedBy = "usersFollow")
	private Set<Newspaper> newsPaper;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(long userId, String userName, String firstName, String lastName, String email, String phoneNumber,
			String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Users(String userName, String firstName, String lastName, String email, String phoneNumber, String address,
			String pswd, Set<Article> articles, Set<Tags> tages, Set<Newspaper> newsPaper) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pswd = pswd;
		this.articles = articles;
		this.tages = tages;
		this.newsPaper = newsPaper;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonIgnore
	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}



}
