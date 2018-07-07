/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

import com.mongodb.DBObject;

import common.Key;

/**
 *
 * @author Duc
 */

//@Entity
//@Table(name = "Users")
public class User {

//	@Column(name = "name")
	private String name;
	
//	@Column(name = "username")
	private String username;
	
//	@Column(name = "password")
	private String password;

	public User() {
	}

	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public User(DBObject userObject) {
		if (userObject == null) {
			return;
		} else {
			this.name = (String) userObject.get(Key.Name);
			this.password = (String) userObject.get(Key.Username);
			this.username = (String) userObject.get(Key.Password);
		}
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

	@Override
	public String toString() {
		return "Users{" + "name=" + name + ", username=" + username + ", password=" + password + '}';
	}

}
