package com.revature.people;

import com.revature.account.Account;
//import com.revature.account.Transactions;

public class RegularEmployee extends Employee{

	public RegularEmployee(String name, String password, int socialsecnum) {
		super(name, password, socialsecnum);
		// TODO Auto-generated constructor stub
		this.admin_auth = false;
	}
}
