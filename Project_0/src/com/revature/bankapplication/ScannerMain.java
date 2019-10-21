package com.revature.bankapplication;



import java.util.Scanner;



import java.util.ArrayList;

import com.revature.account.Account;
import com.revature.people.Administrator;
import com.revature.people.Client;
import com.revature.people.Employee;
import com.revature.people.Person;
import com.revature.people.RegularEmployee;




public class ScannerMain {
	//Create an ArrayList of Clients, Accounts and Customers to be used
	public static ArrayList<Client> clients = new ArrayList<Client>();
	public static ArrayList<Account> accounts = new ArrayList<Account>();
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Administrator> admins = new ArrayList<Administrator>();
	public static ArrayList<RegularEmployee> regularemps = new ArrayList<RegularEmployee>();
	

	public static void main(String[] args) {

	

		//Add all clients and employees as well as the main bank account
		Employee.add_main_bank();
		
		regularemps.add(new RegularEmployee("Zeus", "Jackson", "EWOIls", 3984));
		admins.add(new Administrator("Oden", "Lubba", "MLDMN5", 5832));

		clients.add(new Client("Roman", "Ibba", "AbcDefg", 5555, "Zeus", 4000.00, 795));	
		clients.add(new Client("Steven", "McCanter", "HijkLmnoP", 2020, "Oden", 900.00, 529));



		//Allows to log in as Customer, Employee or Admin

		System.out.println("Enter 1 for Customer, 2 for Employee or 3 for Admin");

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		if(num == 1 || num == 2 || num == 3) {
			if(num == 1) {
				System.out.println("Welcome Valued Customer!");
			}
			else if (num == 2) {
				System.out.println("Welcome Employee!");
			}
			else if (num == 3) {
				System.out.println("Welcome Admin!");
			}
			// Whoever they are, the next step is to ask them who they want to search
			// Account used = find_customer(customer);
			
			
			
			if(num == 1) {
				int place = find_account(clients);
				clients.get(place).fill_options();
				System.out.println("What would you like to do?");
				int select = in.nextInt();
				clients.get(place).select_option(select, place);
			}
			else if(num == 2) {
				int place = find_account(regularemps);
				regularemps.get(place).fill_options();
				System.out.println("What would you like to do?");
				int select = in.nextInt();
				regularemps.get(place).select_option(select, place);
			}
			else if(num == 3) {
				int place = find_account(admins);
				admins.get(place).fill_options();
				System.out.println("What would you like to do?");
				int select = in.nextInt();
				admins.get(place).select_option(select, place);
			}
		}
		else {
			System.out.println("Entered an incorect number");
		}
		
		in.close();
	}
	
	/**
	 * @param customer
	 * @return
	 */
	/*
	 * 
	 * 
	 * 
	 * 
	public static Account find_customer(ArrayList<Account> customer) {
		//Finds Customer info based on Last name and SSN
		System.out.println("Enter Last name and SSN ");
		Account the_one = null;
		boolean found = false;
		
		while(found == false) {
			Scanner c = new Scanner(System.in);

			String last = c.next();
		
			int ssn = c.nextInt();
		
			for(int i = 0; i < customer.size(); i++) {
				if(customer.get(i).getLast().equals(last) || customer.get(i).getSsn() == ssn) {

					System.out.println(customer.get(i));
					the_one =  customer.get(i);
					found = true;
					c.close();
				}		 
			}
			if(the_one == null) {
				System.out.println("Sorry, this is not a valid customer account.");
				System.out.println("Enter Last name and SSN");
			}
		}
		return the_one;
	}*/
	
	public static <T> int find_account(ArrayList<T> people) {
		//Finds Customer info based on Last name and SSN
		System.out.println("Enter Last name and SSN ");
		boolean found = false;
		
		int place = 0;
		
		while(found == false) {
			Scanner c = new Scanner(System.in);

			String last = c.next();
		
			int ssn = c.nextInt();
		
			for(int i = 0; i < people.size(); i++) {
				if(people.get(i).getLast().equals(last) || people.get(i).getSocialsecnum() == ssn) {

					System.out.println(people.get(i));
					// the_one =  customer.get(i);
					place = 1;
					found = true;
					c.close();
				}		 
			}
			if(place == 0) {
				System.out.println("Sorry, this is not a valid account.");
				System.out.println("Enter Last name and SSN");
			}
		}
		return place;
	}
	
	public static double enter_amount() {
		double value;
		System.out.println("How much do you ask for in this process?");
		Scanner in = new Scanner(System.in);
		value = in.nextDouble();
		
		in.close();
		return value;
	}
}