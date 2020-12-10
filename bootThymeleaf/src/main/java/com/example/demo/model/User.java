package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.model.util.PasswordGenarate;

@Entity
@Table
public class User extends PasswordGenarate {
//	@Column(name = "DOB")
//	private Date dob;
//
//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}	
}
