package com.revature.people;

import java.util.HashMap;

import com.revature.account.Transactions;

public abstract class Person {
	protected int id;
	protected String first;
	protected String last;
	protected String password;
	protected int socialsecnum;
	
	HashMap<Integer, String> options = new HashMap<Integer, String>();
	
	public static int number_of_people = 0;
	
	public Person(String first, String last, String password, int socialsecnum) {
		this.first = first;
		this.last = last;
		this.password = password;
		this.socialsecnum = socialsecnum;
		number_of_people++;
		this.id = number_of_people;
	}
	
}
