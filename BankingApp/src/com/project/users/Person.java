package com.project.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Person {
	String name;
	String last;
	static HashMap<String, String> cInfo = new HashMap<String,String>();
	static ArrayList <Customer> list =  new ArrayList<>();
	 List<bankAccount> bAccount = new ArrayList<>();

	public void addBankAccount() { // adds brand new account
		bankAccount a = new bankAccount();
		bAccount.add(a);
	}
	public void addBankAccount(bankAccount c) { //adds an existing account
		bAccount.add(c);
	}
	public static boolean login(String user, String pw) { 
		String temp = cInfo.get(user);
		if(temp == pw)
			return true;
		else
			return false;
	}
	
	public static boolean userCheck(String user) { // check username aliabilty
		if(cInfo.containsKey(user) == true)
			return true;
		else
			return false;
	}
	public bankAccount[] find(Customer a) { // returns list of accounts object for a user
		if(list.contains(a)) {
			
		}
		return null;
	}
	public boolean checkMoney(bankAccount a, double money) {
		if(a.getBalance()>=  money)
			return true;
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
	
}
