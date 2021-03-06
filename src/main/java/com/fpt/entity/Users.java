package com.fpt.entity;

import org.springframework.data.annotation.Id;
/**
 * 
 * @author TungLT25
 * @date Jul 12, 2018
 */
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Users {
	@Id
	private String id;
	private String name;
	private String username;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Users() {
		super();
	}

}
