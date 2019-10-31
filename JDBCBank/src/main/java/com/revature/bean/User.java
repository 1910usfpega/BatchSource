package com.revature.bean;

import java.util.*;
import java.util.Date;
import java.sql.*;

public class User {

	//Users
	public static int userId;
	public static String userType;
	public static String firstName;
	public static String lastName;
	//public static String birthdate; //Date.parse
	public static String streetAddress;
	public static String city;
	public static String state;
	public static String zipCode;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User (int userId) {
		User.userId = userId;
	}
	
	public User (int userId, String userType, String firstName, String lastName, 
			String streetAddress, String city, String state, String zipCode) {
		User.userId = userId;
		User.userType = userType;
		User.firstName = firstName;
		User.lastName = lastName;
		User.streetAddress = streetAddress;
		User.city = city;
		User.state = state;
		User.zipCode = zipCode;
	}
	
	public static int getUserId() {
		return userId;
	}

	public static void setUserId(int userId) {
		User.userId = userId;
	}

	public static String getUserType() {
		return userType;
	}

	public static void setUserType(String userType) {
		User.userType = userType;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		User.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		User.lastName = lastName;
	}

//	public static Date getBirthdate() {
//		return birthdate;
//	}
//
//	public static void setBirthdate(Date birthdate) {
//		User.birthdate = birthdate;
//	}

	public static String getStreetAddress() {
		return streetAddress;
	}

	public static void setStreetAddress(String streetAddress) {
		User.streetAddress = streetAddress;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		User.city = city;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		User.state = state;
	}

	public static String getZipCode() {
		return zipCode;
	}

	public static void setZipCode(String zipCode) {
		User.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return " List of Users listed above... ";
	}

	
	
	
}