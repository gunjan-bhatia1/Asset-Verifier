package com.project.restfulwebservices.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "User_Information")
public class User {

	@Id
	@GeneratedValue
	private int user_id;
	
	 @Column(name = "userType")
	private String userType;
	 
	

	@Column(name = "userName")
	private String userName;
	
	 @Column(name = "email")
	 private String email;

	 @Column(name = "password")
	private String password;

	 public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}
	 public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public synchronized String getUserName() {
		return userName;
	}

	public synchronized void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
		
		
	}
	
	
}