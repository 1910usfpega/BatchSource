package com.revature.driver;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.User;
import com.revature.daoimpl.BankDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.daoimpl.EmployeeDaoimpl;

		public class Driver {
		static Scanner scan = new Scanner(System.in);
		static Customer user = new Customer("", "", "", "");
		static String username = null;
		static String password = null;
		static boolean login = false;
		static CustomerDaoImpl a= new CustomerDaoImpl();
		
			public static void main(String[] args) throws SQLException {
				System.out.println("Welcome to Grant's Bank");
				System.out.println("1: Sign In");
				System.out.println("2: Employee Sign In");
				System.out.println("3: Sign Up ");
				System.out.println("Choose Option: ");
				while(true) {
			
				int input = scan.nextInt();
				switch (input) {
				case 1:
					System.out.println("please enter username");
					 username = scan.next();
					System.out.println("please enter your password");
					 password = scan.next();
					 System.out.print(User.logIn(username, password));
					 login = User.logIn(username, password);
					if(login) {
					user = a.getCustomerbyUsername(username);
						System.out.println(": Welcome " + user.getfName()+" "+user.getlName());
						System.out.println("----------------------------");
						System.out.println("1: View Account");
						System.out.println("2: Get Balance");
						System.out.println("3: Withdraw");
						System.out.println("4: Deposit");
						System.out.println("5: Delete Account");
						System.out.println("6: Change Account");
						System.out.println("7: Logout");
					loop:	switch (input) {
						// Login log out
						case 1:
							//view account
							BankDaoImpl viewAcc = new BankDaoImpl();
							//viewAcc.ViewAccount(accountNumber);
							break;
						// create customer account
						case 2:
							BankDaoImpl getB = new BankDaoImpl();
							//getB.ge
							//get balance
							break;
						// create admin account
						case 3:
							//withdraw method
							BankDaoImpl withM = new BankDaoImpl();
				//			wit.withdraw(amount, accountNumber);
							break;
						// exit system
						case 4:
							//deposit
							BankDaoImpl depM = new BankDaoImpl();
							break;
						case 5:
							//delete account
							BankDaoImpl delM = new BankDaoImpl();
							break;
						// exit system
						case 6:
							//change account;
							break;
							
						case 7:
							
							break loop;
							
						}
					}					
					System.out.print("");
					break;
				case 2:
					System.out.println("please enter username");
					 username = scan.next();
					System.out.println("please enter your password");
					 password = scan.next();
					 login =User.logIn(username, password);
					if(login) {
						System.out.println(": Welcome " + user.getfName()+" "+user.getlName());
						System.out.println("----------------------------");
						System.out.println("1: View User Account");
						System.out.println("2: Check User's Balance");
						System.out.println("3: Delete a User's Account");
						System.out.println("4: Update a User's Account");
						System.out.println("5: Logout");
						
						switch (input) {
						// Login log out
						case 1:
							//view account
							BankDaoImpl viewAcc = new BankDaoImpl();
							//viewAcc.ViewAccount(accountNumber);
							break;
						// create customer account
						case 2:
							BankDaoImpl getB = new BankDaoImpl();
							//get balance
							break;
						// create admin account
						case 3:
							//delete
							EmployeeDaoimpl DelUser = new EmployeeDaoimpl();
				
							break;
					
						case 4:
							//update user account
							EmployeeDaoimpl updateU = new EmployeeDaoimpl();
							break;
							
						case 5:
							
						if(login) {
									System.out.println("Thank you for Banking");
						}
						}
						
						}
					break;
				case 3: 
					System.out.println("what is your first name?");
					String fname = scan.next();
					System.out.println("what is your last name?");
					String lname = scan.next();
					System.out.println("what would you like your username to be?");
					String username = scan.next();
					System.out.println("5: please enter your password");
					String password = scan.next();
					
					CustomerDaoImpl cdi = new CustomerDaoImpl();
			    	System.out.println(" "+cdi.createUsers(fname, lname, username, password));
					
					boolean worked = user.createNewUser(username, fname, lname, password, false);
					while(!worked) {
			    	 System.out.print("please enter another username that one was taken");
			    	  username = scan.next();
			    	   worked = user.createNewUser(username, fname, lname, password, false);
					}
			     System.out.print("you made your new account. look forward to banking with you my");
				break;
				default:
				}	
			}
			}
}