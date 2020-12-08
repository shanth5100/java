package com.example.demo.model;

import java.util.Date;

import com.example.demo.model.util.EmailGenarate;

public class User
//extends EmailGenarate
{
	private long id;
	private String username;
	private String name;
	private boolean marrried;
	private Date dob;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarrried() {
		return marrried;
	}

	public void setMarrried(boolean marrried) {
		this.marrried = marrried;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", marrried=" + marrried + ", dob="
				+ dob + "]";
	}

	
}
