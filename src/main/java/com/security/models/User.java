package com.security.models;

public class User {
	
	String username;
	String passwored;
	String email;
	
	public User()
	{}

	public User(String username, String passwored, String email) {
		this.username = username;
		this.passwored = passwored;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswored() {
		return passwored;
	}

	public void setPasswored(String passwored) {
		this.passwored = passwored;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
