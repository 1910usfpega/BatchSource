package com.bankofdoom.bean;

import java.io.Serializable;
import java.math.BigInteger;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -805205426868800794L;
		//Scanner sc = new Scanner(System.in);
	// details for the user bean
		private String userName;
		private String password;
		private String firstName;
		private String lastName;
		private String address;
		private String email;
		private String phoneNumber;
		private String userType;
		
		
		
//		constructor
		public User(String userName, String password, String firstName, String lastName, String address, String email,
				String phoneNumber, String userType) {
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

		public User() {
			super();
			// TODO Auto-generated constructor stub
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

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
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
			return userName + "," + password + "," + firstName + ","+ lastName 
					+ "," + address + "," + email + "," + phoneNumber
					+ "," + userType;
		}
		
		/* moved to IOUser
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

*/
		

	
}
