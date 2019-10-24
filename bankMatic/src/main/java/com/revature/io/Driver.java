package com.revature.io;

import com.revature.bean.Account;
import com.revature.bean.Employee;

public class Driver {

	public static void main(String[] args) {
//		Account a1 = new Account("Checking", 5000.00, "iskandar", "pending", 1000001);
//		Account a2 = new Account("Checking", 5020.00, "username1", "active", 1000002);
//		Account a3 = new Account("Checking2", 5021.00, "username1", "active", 1000003);
//		
//		AccountsIO.accountList.add(a1);
//		AccountsIO.accountList.add(a2);
//		AccountsIO.accountList.add(a3);
//		AccountsIO.writeToFile();
//		
//		System.out.println("Done");
		
		
		Employee a1 = new Employee("emp", "pass");
		
		IOWithCollections.readUserFile();
		IOWithCollections.usersList.add(a1);
		IOWithCollections.writeUserFile();
		
		System.out.println(IOWithCollections.usersList.toString());
		
	}

}
