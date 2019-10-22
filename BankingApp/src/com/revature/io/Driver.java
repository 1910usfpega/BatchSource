package com.revature.io;

import com.revature.bean.Account;
import com.revature.bean.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee a1 = new Employee("emp", "pass");
		
		IOWithCollections.readUserFile();
		IOWithCollections.usersList.add(a1);
		IOWithCollections.writeUserFile();
//		AccountsIO.accountList.add(a2);
//		AccountsIO.accountList.add(a3);
//		AccountsIO.writeToFile();
		
		System.out.println("Done");
		
	}

}
