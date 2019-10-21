package com.revature.people;

import java.util.HashMap;

public abstract class Person {
	protected int id;
	protected String first;
	protected String last;
	protected String password;
	protected int socialsecnum;
	
	public static HashMap<Integer, String> options = new HashMap<Integer, String>();
	
	public static int number_of_people = 0;
	
	public Person(String first, String last, String password, int socialsecnum) {
		this.first = first;
		this.last = last;
		this.password = password;
		this.socialsecnum = socialsecnum;
		number_of_people++;
		this.id = number_of_people;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getSocialsecnum() {
		return socialsecnum;
	}


	public void setSocialsecnum(int socialsecnum) {
		this.socialsecnum = socialsecnum;
	}


	public abstract void fill_options();
		
	public abstract void select_option(int n, int place);
	
	public static void print_options() {
		 System.out.println(options);
	}


	public int getSsn() {
		// TODO Auto-generated method stub
		return ;
	}

}