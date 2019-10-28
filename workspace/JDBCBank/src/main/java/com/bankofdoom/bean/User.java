package com.bankofdoom.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class User implements Serializable {
	/**
	 *  
	 */

	private static final long serialVersionUID = -805205426868800794L;
	// Scanner sc = new Scanner(System.in);
	// details for the user bean
	private int userId;

	// this is the traditional 'User name' displayed and will be sanitized
	private String uName;

	// for security reasons passwords are NEVER handled as a string
	private int password;

	// User information
	private String name;
	private String address;
	private String email;
	private String phoneNumber;

	// role based access
	// because the
	private int role;

	// constructor

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String uName, String name, String address, String email, String phoneNumber,
			int role) {
		super();
		this.setUserId(userId);
		this.uName = uName;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	
	public User(String uName, int password, String name, String address, String email, String phoneNumber) {
		super();
		this.uName = uName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public User(int userId) {
		super();
		this.userId = userId;
	}

	public User(int userId, String uName) {
		super();
		this.userId = userId;
		this.uName = uName;
	}

	public User(String un, int pw) {
		super();
		this.uName=un;
		this.password=pw;
	}

	// accessors and modifiers
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuName() {
		return uName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [uName=" + uName + ", password=" + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
	}

}
