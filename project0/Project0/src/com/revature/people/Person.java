package com.revature.people;

import com.revature.account.Transactions;

public abstract class Person {
	protected int id;
	protected String name;
	protected String password;
	protected int socialsecnum;
	
	public static int number_of_people = 0;
	
	public Person(String name, String password, int socialsecnum) {
		this.name = name;
		this.password = password;
		this.socialsecnum = socialsecnum;
		number_of_people++;
		this.id = number_of_people;
	}
}
