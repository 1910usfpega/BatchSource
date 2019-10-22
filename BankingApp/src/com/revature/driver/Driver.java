package com.revature.driver;

//import java.util.Date;
//import java.util.List;
import java.util.Scanner;

import com.revature.bean.Account;
//import com.revature.bean.Customer;
import com.revature.bean.Login;
//import com.revature.bean.LoginException;
import com.revature.bean.Logon;
import com.revature.bean.User;
import com.revature.io.AccountsIO;
import com.revature.io.IOWithCollections;
import com.revature.loops.MainLoop;

public class Driver {
	
	public static void main(String[] args) {
		IOWithCollections.readUserFile();
		
		AccountsIO aIO = AccountsIO.getInstance();
		aIO.readFile();
		
		for (Account acc:aIO.accountList) {
			System.out.println(acc.toString());
		}
//		System.out.println(aIO.accountList.toString());
		MainLoop.main();
		
		
		
		
		


//		IOWithCollections.writeUserFile();
//		currentUser = Logon.logonProcess();
		
//		Date dateOfB = new Date();
//		Customer c1 = new Customer("Iskandar", "Bakhtizin", dateOfB, true, "iskandar", "pass");
//		IOWithCollections.usersList.add(c1);
//		
		
//		User u1 = new User("username1", "pass", "customer");
//		User u2 = new User("username2", "pass", "customer");
//		User u3 = new User("username3", "pass", "customer");
//		
//		IOWithCollections.usersList.add(u1);
//		IOWithCollections.usersList.add(u2);
//		IOWithCollections.usersList.add(u3);
//		
//		IOWithCollections.writeUserFile();
//		 TODO Auto-generated method stub
		
		// Read Customers, Accounts and Transactions from file
		
		
		// Check if we already logged in
		
		
		
		
		


		
	}

}
