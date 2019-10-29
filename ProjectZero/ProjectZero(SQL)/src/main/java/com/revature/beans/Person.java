package com.revature.beans;

public class Person {
	private String firstName;
	private String lastName;
	private String username;
	private String password; 
	private int userId;
	private int userType;


	//constructor
	public Person(String firstName, String lastName, String username, String password,int userType, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.userId = userId;
	}
	

	public Person(String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.userType = 3;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, String password) {
		super();
		this.username = username;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", userId=" + userId + "]";
	}
	
}
