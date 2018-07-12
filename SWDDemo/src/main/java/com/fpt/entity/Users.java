package com.fpt.entity;

/**
 * 
 * @author TungLT25
 * @date Jul 12, 2018
 */
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Users {

	private String name;

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
