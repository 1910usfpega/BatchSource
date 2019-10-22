package com.revature.bean;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Person {
	String name;
	String last;
	String username;
	static HashMap<String, String> cInfo = new HashMap<>();
	static ArrayList<Customer> pending = new ArrayList<>();
	static HashMap<Customer, bankAccount> pendingJoint = new HashMap<>();
	static ArrayList <Customer> list =  new ArrayList<>();
	static ArrayList <Customer> Empolyees =  new ArrayList<>();
	static ArrayList <bankAccount> bankAccounts =  new ArrayList<>();
	static ArrayList <Customer> pending2 = new ArrayList<>();
	
	public Person(String name, String last, String username, String password) {
		this.name = name;
		this.last = last;
		this.username = username;
		cInfo.put(username,password);
	}
	
	public static HashMap<Customer, bankAccount> joint(){
		if(!pendingJoint.isEmpty()) {
			return pendingJoint;
		}
		return null;
	}
	
	public static boolean login(String user, String pw) { 
		String temp = cInfo.get(user);
		if(temp == pw)
			return true;
		else
			return false;
	}
	public static ArrayList<bankAccount> getBankAccountsForIDCheck(){
		return bankAccounts;
	}
	public static boolean userCheck(String user) { // check username aliabilty
		if(cInfo.containsKey(user) == true)
			return true;
		else
			return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}	
	public String getUsername() {
		return this.username;
	}	
}