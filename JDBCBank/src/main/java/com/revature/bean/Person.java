package com.revature.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1143026946380690275L;
	protected static int PERSON_ID;
	protected String first;
	protected String last;
	protected String username;
	protected String password;
	static HashMap<String, String> cInfo = new HashMap<String, String>();
	static ArrayList<Customer> pending = new ArrayList<Customer>();
	static HashMap<Customer, BankAccount> pendingJoint = new HashMap<Customer, BankAccount>();
	static ArrayList<Customer> list = new ArrayList<Customer>();
	static ArrayList<Customer> Employees = new ArrayList<Customer>();
	
	static ArrayList<Customer> pending2 = new ArrayList<Customer>();
	
	
	public Person(int PERSON_ID, String first, String last, String username, String password) {
		this.PERSON_ID = PERSON_ID;
		this.first = first;
		this.last = last;
		this.username = username;
		this.password = password;
		cInfo.put(username, password);
	}
	
	public static HashMap<Customer, BankAccount> joint(){
		if(!pendingJoint.isEmpty()) {
			return pendingJoint;
		}
		return null;
	}
	
	public static boolean login(String user, String pw) {
		String temp = cInfo.get(user);
		if(temp.equals(pw)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean userCheck(String user) { // check username elegibility
		if(cInfo.containsKey(user) == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String name) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
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
}
