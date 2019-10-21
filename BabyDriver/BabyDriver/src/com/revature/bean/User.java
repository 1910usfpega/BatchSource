package com.revature.bean;

import java.io.Serializable;
import java.util.Scanner;

public class User implements Serializable {
	
		private String username;
		private String password;
		private String firstName;
		private String lastName;
		private String address;
		private String userType;
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
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		@Override
		public String toString() {
			return "User [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
					+ lastName + ", address=" + address + ", userType=" + userType + "]";
		}
		public User(String username, String password, String firstName, String lastName, String address,
				String userType) {
			super();
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.userType = userType;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

}
