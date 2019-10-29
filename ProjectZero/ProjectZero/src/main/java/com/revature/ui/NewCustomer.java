package com.revature.ui;

import java.sql.SQLException;
import java.util.Scanner;
import com.revature.beans.Person;
import com.revature.daoimpl.PersonDaoImpl;

public class NewCustomer {

	public static  void newLoop(Scanner in) {
		String input;
		PersonDaoImpl pdi = new PersonDaoImpl();
		boolean nameFree = false;
		while(nameFree ==false) {		

		System.out.println("Press 1 to Register");
		System.out.println("Press 2 to exit");
		input = in.nextLine();
		int putIn = Integer.parseInt(input);
		switch(putIn) {
			case 1:
						System.out.println("Enter First Name");
						String fn = in.nextLine();
						System.out.println("Enter Last Name");
						String ln = in.nextLine();
						System.out.println("Enter a potential User Name");
					String un = in.nextLine();
					if(pdi.checkAvailability(un)==true) {
		
						System.out.println("User Name Available \n Enter a Password");
						String pw = in.nextLine();
						Person newClient = new Person(fn,ln,un,pw);
						try {
							pdi.insertPerson(newClient);
						} catch (SQLException e) {
					
							e.printStackTrace();
						}

						System.out.println("new user added");
						nameFree = true;
						} else {System.out.println("That User Name has been taken, please choose another");
							}
				
				break;
			case 2:
				return;
		default: System.out.println("Please enter a valid input.");
		break;
		
		}
		}
		
	}
	
}
	
	

