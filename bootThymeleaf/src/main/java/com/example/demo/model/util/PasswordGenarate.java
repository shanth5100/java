package com.example.demo.model.util;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PasswordGenarate extends UsernameGenarate {
	
	@Column(nullable = false, length = 100)
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String username) {
		this.password = username;
	}
	
}
