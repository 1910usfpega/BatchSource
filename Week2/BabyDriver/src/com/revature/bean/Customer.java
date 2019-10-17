package com.revature.bean;

public class Customer {
	private String name;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	public Customer(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Customer() {
		super();
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	

}
