package com.revature.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.PersonDaoImpl;
import com.revature.storage.MotherLoad;
public class Driver {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args) {
		MotherLoad ml = new MotherLoad();
		
		Employee mario = new Employee("mario", "battle", "un", "pw");
		Employee kyle = new Employee("kyle","ansley","1","11");
		Admin andy = new Admin("andy", "martinez","2","22");
		Employee eddie = new Employee("eddie","hardy","3","33");
		Customer ben = new Customer("ben","button","4","44");
		//Account bensAcct = new Account(865235, "Checking",9000.00);
		//ml.addAcct(bensAcct);
			ml.addUser(mario); ml.addLogIn(mario);
			ml.addUser(kyle); ml.addLogIn(kyle);
			ml.addUser(eddie); ml.addLogIn(eddie);
			ml.addUser(andy); ml.addLogIn(andy);
			ml.addUser(ben); ml.addLogIn(ben);
		PersonDaoImpl pdi = new PersonDaoImpl();
		AccountDaoImpl adi = new AccountDaoImpl();
//		try {
//		pdi.insertPerson(mario.getFirstName(), mario.getLastName(), mario.getUsername(), mario.getPassword());
//		pdi.insertPerson(kyle.getFirstName(), kyle.getLastName(), kyle.getUsername(), kyle.getPassword());
//		pdi.insertPerson(eddie.getFirstName(), eddie.getLastName(), eddie.getUsername(), eddie.getPassword());
//		pdi.insertPerson(andy.getFirstName(), andy.getLastName(), andy.getUsername(), andy.getPassword());
//		pdi.insertPerson(ben.getFirstName(), ben.getLastName(), ben.getUsername(), ben.getPassword());
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
		
		String input= "";
		while(input != "5") {
		System.out.println("Welcome, What would you like to do today?");
		System.out.println("--------------------------");
		System.out.println("Press 1 for New Customer");
		System.out.println("Press 2 for Customer Log in");
		System.out.println("Press 3 for Employee Log in");
		System.out.println("Press 4 for Admin Log in");
		System.out.println("Prss 5 to leave Menus");
		
		input = in.nextLine();
		int putIn= Integer.parseInt(input);
		
		switch(putIn)
		{
		case 1:
			NewCustomer.newLoop(in, ml);
			break;
		case 2:
			ReturningCustomer.returningLoop(in, ml);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default: System.out.println("Please select a valid input");
			

		}
		
		}
	}
}
