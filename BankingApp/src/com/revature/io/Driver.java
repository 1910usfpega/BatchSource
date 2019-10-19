package com.revature.io;

import com.revature.bean.Account;

public class Driver {

	public static void main(String[] args) {
		Account a1 = new Account("Checking", 5000.00, "iskandar", "pending", 1000001);
		
		AccountsIO.accountList.add(a1);
		AccountsIO.writeToFile();
		
	}

}
