package com.example.demo.model.util;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UsernameGenarate extends EmailGenarate {
	
	@Column(nullable = false, unique = true, length = 30)
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
