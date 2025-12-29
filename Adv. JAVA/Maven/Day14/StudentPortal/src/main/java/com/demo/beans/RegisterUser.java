package com.demo.beans;

import java.time.LocalDate;

public class RegisterUser {
	private Integer id;
	private String userId;
	private String name;
	private String gender;
	private LocalDate dob;
	private String username;
	private String password;
	private String skills;
	String photoPath;
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUser(Integer id, String userId, String name, String gender, LocalDate dob, String username,
			String password, String skills, String photoPath) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.username = username;
		this.password = password;
		this.skills = skills;
		this.photoPath = photoPath;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	
	
}
