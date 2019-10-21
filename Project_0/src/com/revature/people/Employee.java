package com.revature.people;



import com.revature.account.Account;
import com.revature.bankapplication.ScannerMain;


public abstract class Employee extends Person{

	protected boolean admin_auth;
	public static Account main_bank = new Account("Bank", 10000);

	public static void add_main_bank() {
		ScannerMain.accounts.add(main_bank);
	}

	public Employee(String first, String last, String password, int socialsecnum) {

		super(first, last, password, socialsecnum);
		// TODO Auto-generated constructor stub
	}

	public void select_option(int n, int place) {
		// TODO Auto-generated method stub
		
	}
	


}