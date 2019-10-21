package com.revature.people;



import com.revature.account.Account;
import com.revature.bankapplication.ScannerMain;

//import com.revature.account.Transactions;

public class RegularEmployee extends Employee{

	public RegularEmployee(String first, String last, String password, int socialsecnum) {

		super(first, last, password, socialsecnum);
		// TODO Auto-generated constructor

	}

	@Override
	public void fill_options() {
		options.put(1, "View bank information");
		options.put(2, "View account owner's personal information");
		options.put(3, "Logout");
	}
	
	@Override
	public void select_option(int n, int place) {
		if (n == 1) {
				ScannerMain.clients.get(place).your_account.toString();
		}
		else if(n == 2) {
				ScannerMain.clients.get(place).toString();
		}
		else if(n == 3) {
				// Ask Roman about if he has a function for logging out
				logout();
		}
	}
}