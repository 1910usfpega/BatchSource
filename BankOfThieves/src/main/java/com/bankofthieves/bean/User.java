package com.bankofthieves.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
	
	private String uName;
	private double password;
	private String fullName;
	private String email;
	private String address;
	private String phoneNumber;
	private DateFormat dateOfBirth = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uName, double password, DateFormat dateOfBirth, String firstName, String lastName, String email,
			String address, String phoneNumber) {
		super();
		this.uName = uName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.fullName = firstName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	public String getuName() {
		return uName;
	}

	public double getPassword() {
		return password;
	}

	public DateFormat getDateOfBirth() {
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

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public void setDateOfBirth(DateFormat dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	

		public static boolean login() {
			return false;
		}
	
		public static void view() {
					
		}
		
		public static void create() {
			
		}
		
		public static boolean delete() {
			return false;
		}
		
		public static double deposit() {
			return 0;
		}
		
		public static double  withdraw() {
			return 0;
		}
		
		public static boolean logout() {
			return false;
		}
		

	@Override
	public String toString() {
		return "User [uName=" + uName + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", fullName="
				+ fullName + ", email=" + email + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
	
