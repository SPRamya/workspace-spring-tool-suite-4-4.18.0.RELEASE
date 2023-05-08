package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="exam")
public class ex {
	@Id
	private String Email;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public ex() {
		
		// TODO Auto-generated constructor stub
	}

	public ex(String email) {
		super();
		Email = email;
	}

	
}
