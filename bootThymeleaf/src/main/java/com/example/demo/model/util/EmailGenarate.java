package com.example.demo.model.util;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EmailGenarate extends NameGenarate {
	
	@Column(unique = true, length = 100)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
