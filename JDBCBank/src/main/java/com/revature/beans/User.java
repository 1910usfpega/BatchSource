package com.revature.beans;

import java.sql.SQLException;
import java.util.List;

import com.revature.daoimpl.UserDaoImpl;
import com.revature.exceptions.SignInException;


public class User {
	private Integer userId;
	private String username;
	private String userType;
	private String firstName;
	private String lastName;
	
	

	public static User login(String login, String password) throws SignInException {
		try {
			UserDaoImpl udi = new UserDaoImpl();
			List<User> allCustomers = udi.getUserByLoginAndPass(login, password);
			
			if (allCustomers.size() != 1) {
				throw new SignInException("Such a login/password pair was not found");
			} else {
				return allCustomers.get(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new User();
	}
	
	public void showMenu() {
		System.out.println("Abstract User cant show menu");
	}

	public User() {
		super();
	}
	
	public User(Integer userId, String username, String userType, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.username = username;
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userType=" + userType + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
