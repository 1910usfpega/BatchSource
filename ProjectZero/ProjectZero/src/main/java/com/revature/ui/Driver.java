package com.revature.ui;

import java.sql.SQLException;
import java.util.Scanner;
import com.revature.beans.Account;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.PersonDaoImpl;

public class Driver {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args) {
	
		PersonDaoImpl pdi = new PersonDaoImpl();
		AccountDaoImpl adi = new AccountDaoImpl();
		String input= "";
		while(input != "5") {
		System.out.println("Welcome, What would you like to do today?");
		System.out.println("--------------------------");
		System.out.println("Press 1 for New Customer");
		System.out.println("Press 2 for Customer Log in");
		System.out.println("Press 3 for Admin Log in");
		System.out.println("Press 4 to leave Menus");
		
		//input = in.nextLine();
		int putIn= in.nextInt();
		
		switch(putIn)
		{
		case 1:
			NewCustomer.newLoop(in);
			break;
		case 2:
			ReturningCustomer.returningLoop(in);
			break;
		case 3:
			AdminLoop.adminLoop(in);
			break;
		case 4:
			System.out.println("Thank You, Have a Nice Day!");
			return;
		default: System.out.println("Please select a valid input");
			

		}
		
		}
	}
}
