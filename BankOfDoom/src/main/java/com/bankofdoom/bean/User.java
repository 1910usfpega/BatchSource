package com.bankofdoom.bean;

import java.math.BigInteger;
import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	// details for the user bean
		private String userName;
		private String password;
		private String firstName;
		private String lastName;
		private String address;
		private String email;
		private BigInteger phoneNumber;
		private String userType;
		
//		constructor
		public User(String userName, String password, String firstName, String lastName, String address, String email,
				BigInteger phoneNumber, String userType) {
			super();
			this.userName = userName;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.userType = userType;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
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

		public BigInteger getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(BigInteger phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		@Override
		public String toString() {
			return "User [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
					+ lastName + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber
					+ ", userType=" + userType + "]";
		}
		
		//method to create new user/account. still need logic
		public void openAccount() {
			//new log in info
			System.out.println("Please create new username:");
			userName=sc.next();
			System.out.println("Please create new password:");
			password=sc.next();
		}
		//method to add personal info to newly created account. still need logic
		public void customerPersonalInfo() {
			System.out.println("Please enter First name:");
			firstName=sc.next();
			System.out.println("Please enter Last name:");
			lastName=sc.next();
			System.out.println("Please enter address:");
			address=sc.next();
			System.out.println("Please enter email:");
			email=sc.next();
			System.out.println("Please enter phone number:");
			phoneNumber=sc.nextBigInteger();
		}


		

	
}
