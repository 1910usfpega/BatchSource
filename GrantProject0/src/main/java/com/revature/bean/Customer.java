package com.revature.bean;

public class Customer extends User {
String userName;
String lName;
String fName;
String passWord;
	public Customer(String userName, String fName, String lName, String passWord) {
		super(userName, fName, lName, passWord);
		this.userName = userName;
		this.fName = fName;
		this.lName = lName;
		this.passWord = passWord;
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
	
	

	
}
