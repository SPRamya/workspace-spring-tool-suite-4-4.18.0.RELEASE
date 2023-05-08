package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class login {
	@Id
	private int number;
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public login() {
		
		// TODO Auto-generated constructor stub
	}
	private String Password;
	public login(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	public login(int number) {
		super();
		this.number = number;
	}
	
	
}
