package com.jdbc.bank.bean;

import java.util.Date;

public class User {
	
	private String uName;
	//may change to a String later if this takes to long.
	private int userID;
	private double password;
	private String fullName;
	private String email;
	private String address;
	private String phoneNumber;
	private Date dateOfBirth ;
	
	public User() {
		super();
	}

	public User(int userID, String uName, double password, 
			Date dateOfBirth, String fullName, String email,
			String address, String phoneNumber) {
		super();
		this.uName = uName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getUserID() {
		return userID;
	}
	
	public String getUName() {
		return uName;
	}

	public double getPassword() {
		return password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFulltName() {
		return fullName;
	}


	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public void setUName(String uName) {
		this.uName = uName;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public void setDateOfBirth() {
		this.dateOfBirth = null;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	
		

	@Override
	public String toString() {
		return "User [uName=" + uName + ", password=" + password 
				+ ", dateOfBirth=" + dateOfBirth
				+", fullName=" + fullName + ", email=" + email 
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
	
