package com.bankofdoom.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -805205426868800794L;
	// Scanner sc = new Scanner(System.in);
	// details for the user bean
	
	//this is the traditional 'User name' displayed and will be sanitized
	private String uName;
	//for security reasons passwords are NEVER handled as a string
	private long password;
	
	//User information
	private String name;
	private String address;
	private String email;
	private String phoneNumber;
	
	//role based access
	private ArrayList<String> role;

//		constructor

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(String uName, long password, String name, String address, String email, String phoneNumber,
		ArrayList<String> role) {
	super();
	this.uName = uName;
	this.password = password;
	this.name = name;
	this.address = address;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.role = role;
}

	//accessors and modifiers
	

	public void setUname(String user) {
		this.uName = user;
	}

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
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

	public ArrayList<String> getRole() {
		return role;
	}

	public void setRole(ArrayList<String> role) {
		this.role = role;
	}

	
	@Override
	public String toString() {
		return "User [uName=" + uName + ", password=" 
				+ password + ", name=" + name + ", address="+ address 
				+ ", email=" + email + ", phoneNumber=" + phoneNumber 
				+ ", role=" + role + "]";
	}

}
