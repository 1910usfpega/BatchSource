package com.revature.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.daoimpl.CustomerDaoImpl;

public class Customer extends User {
String userName;
String lName;
String fName;
String passWord;
static CustomerDaoImpl a = new CustomerDaoImpl();
	public Customer(String userName, String fName, String lName, String passWord) {
		super(userName, fName, lName, passWord);
		this.userName = userName;
		this.fName = fName;
		this.lName = lName;
		this.passWord = passWord;
		try {
			boolean aa =a.createUsers(fName, lName, userName, passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", lName=" + lName + ", fName=" + fName + ", passWord=" + passWord
				+ "]";
	}
	public ArrayList<Customer> getAllCustomer(){
		try {
			return a.getCustomers();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		 
	}
	
	

	
}
