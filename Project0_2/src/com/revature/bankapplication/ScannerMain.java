package com.revature.bankapplication;



import java.util.Scanner;



import java.util.ArrayList;

import com.revature.account.Account;
import com.revature.people.Client;



public class ScannerMain {


	public static void main(String[] args) {

	

		//Create an ArrayList of Customers

		ArrayList<Client> clients = new ArrayList<Client>();
		ArrayList<Account> accounts = new ArrayList<Account>();

		clients.add(new Client("Roman", "Ibba", "AbcDefg", 5555, "Zeus", 4000.00, accounts));	

		clients.add(new Client("Steven", "McCanter", "HijkLmnoP", 2020, "Oden", 900.00, accounts));

	

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
			
			int place = find_customer(clients);
			
			if(num == 1) {
				// Give options for a client/customer
				System.out.println("What do you want to do in this account?");
				System.out.println("1) View Bank Info");
				System.out.println("2) Withdraw");
				System.out.println("3) Deposit");
				System.out.println("4) Transfer from another Account");
				System.out.println("5) Transfer to another Account");
				System.out.println("6) Exit account");
				
				int num2 = in.nextInt();
				if(num2 == 1 || num2 == 2 || num2 == 3 || num2 == 4 || num2 == 5 || num2 == 6) {
					
					if(num2 == 1) {
						clients.get(place).
					}
					else if(num2 == 2) {
						System.out.println("How much do you want to withdraw?");
						double amount = in.nextDouble();
						
						accounts.get(place).withdrawal(amount);
					}
					else if(num2 == 3) {
						System.out.println("How much do you want to deposit?");
						double amount = in.nextDouble();
						
						accounts.get(place).deposit(amount);
					}
					else if(num2 == 4) {
						System.out.println("What other account do you want to transfer money from?");
						int other_place = find_customer(accounts);
						System.out.println("How much do you want to transfer?");
						double amount = in.nextDouble();
						
						customer.get(place).transferFrom(amount, customer.get(other_place));
					}
					else if(num2 == 5) {
						System.out.println("What other account do you want to transfer money to?");
						int other_place = find_customer(customer);
						System.out.println("How much do you want to transfer?");
						double amount = in.nextDouble();
						
						customer.get(place).transferTo(amount, customer.get(other_place));
					}
					else if(num2 == 6) {
						System.out.println("Goodbye," + customer.get(place).getFirst() + " " + customer.get(place).getLast());
					}
				}
			}
				
			else if(num == 2) {
				// Give options for a regular employee
				System.out.println("What do you want to do in this account?");
				System.out.println("1) View Bank Info");
				System.out.println("2) View Customer's personal info");
				System.out.println("2) View Other Employee information");
				System.out.println("6) Exit account");
				
				int num2 = in.nextInt();
				if(num2 == 1 || num2 == 2 || num2 == 3 || num2 ==  4 || num2 == 5 || num2 == 6) {
					
					if(num2 == 1) {
						customer.get(place).toString();
					}
					else if(num2 == 2) {
						System.out.println("How much do you want to withdraw?");
						double amount = in.nextDouble();
						
						customer.get(place).withdraw(amount);
					}
					else if(num2 == 3) {
						System.out.println("How much do you want to deposit?");
						double amount = in.nextDouble();
						
						customer.get(place).withdraw(amount);
					}
					else if(num2 == 4) {
						System.out.println("What other account do you want to transfer money from?");
						int other_place = find_customer(customer);
						System.out.println("How much do you want to transfer?");
						double amount = in.nextDouble();
						
						customer.get(place).transferFrom(amount, customer.get(other_place));
					}
					else if(num2 == 5) {
						System.out.println("What other account do you want to transfer money to?");
						int other_place = find_customer(customer);
						System.out.println("How much do you want to transfer?");
						double amount = in.nextDouble();
						
						customer.get(place).transferTo(amount, customer.get(other_place));
					}
					else if(num2 == 6) {
						System.out.println("Goodbye," + customer.get(place).getFirst() + " " + customer.get(place).getLast());
					}
				}
			}
				
			}
			else if(num == 3) {
				// Give options for an admin
			}
			
			// Find out what they want to do with the bank account
			/*
			 * 
			 * If customer,
			 * 			1) View Info.
			 * 			2) Withdraw
			 * 			3) Deposit
			 * 			4) Transfer to another account
			 * 			5) Remove from another account
			 * 
			 * 
			 * If employee,
			 * 			1) View Bank Info
			 * 			2) View Customer Info
			 * 			3) Approve / Disapprove  -- give error if already approved
			 * 
			 * If admin,
			 * 			1) View Bank Info
			 * 			2) View Customer Info
			 * 			3) Approve / Disapprove
			 * 			4) Canel account
			 * 			5) Withdraw
			 * 			6) Deposit
			 * 			7) Transfer to account from main bank
			 * 			8) Transfer from account to main bank 
			 * 
			 */
			
			// Customers, Employees and Admins all have their own account
			// Create an individual STATIC class for each person type
			/*
			System.out.println("What do you want to do in this account?");
			System.out.println("1) View Bank Info");
			System.out.println("2) Withdraw");
			System.out.println("3) Deposit");
			System.out.println("4) Transfer from another Account");
			System.out.println("5) Transfer to another Account");
			System.out.println("6) Exit account");
			
			int num2 = in.nextInt();
			if(num2 == 1 || num2 == 2 || num2 == 3 || num2 == 4 || num2 == 5 || num2 == 6) {
				
				if(num2 == 1) {
					customer.get(place).toString();
				}
				else if(num2 == 2) {
					System.out.println("How much do you want to withdraw?");
					double amount = in.nextDouble();
					
					customer.get(place).withdraw(amount);
				}
				else if(num2 == 3) {
					System.out.println("How much do you want to deposit?");
					double amount = in.nextDouble();
					
					customer.get(place).withdraw(amount);
				}
				else if(num2 == 4) {
					System.out.println("What other account do you want to transfer money from?");
					int other_place = find_customer(customer);
					System.out.println("How much do you want to transfer?");
					double amount = in.nextDouble();
					
					customer.get(place).transferFrom(amount, customer.get(other_place));
				}
				else if(num2 == 5) {
					System.out.println("What other account do you want to transfer money to?");
					int other_place = find_customer(customer);
					System.out.println("How much do you want to transfer?");
					double amount = in.nextDouble();
					
					customer.get(place).transferTo(amount, customer.get(other_place));
				}
				else if(num2 == 6) {
					System.out.println("Goodbye," + customer.get(place).getFirst() + " " + customer.get(place).getLast());
				}
			}
		}
		*/
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
	
	public static int find_customer(ArrayList<Client> customer) {
		//Finds Customer info based on Last name and SSN
		System.out.println("Enter Last name and SSN ");
		boolean found = false;
		
		int place = 0;
		
		while(found == false) {
			Scanner c = new Scanner(System.in);

			String last = c.next();
		
			int ssn = c.nextInt();
		
			for(int i = 0; i < customer.size(); i++) {
				if(customer.get(i).getLast().equals(last) || customer.get(i).getSsn() == ssn) {

					System.out.println(customer.get(i));
					// the_one =  customer.get(i);
					place = 1;
					found = true;
					c.close();
				}		 
			}
			if(place == 0) {
				System.out.println("Sorry, this is not a valid customer account.");
				System.out.println("Enter Last name and SSN");
			}
		}
		return place;
	}
}