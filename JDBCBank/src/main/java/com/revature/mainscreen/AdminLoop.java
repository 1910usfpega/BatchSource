package com.revature.mainscreen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Scanner;

import com.revature.beans.AccountBean;
import com.revature.beans.CustomerBean;
import com.revature.beans.EmployeeBean;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.exceptions.NotEnoughFundsException;
import com.revature.util.CheckDatabase;

public class AdminLoop {
	public static void adminLoop(Scanner sc) {
		// Start by entering username and the password
		String input = "";
		EmployeeBean thisEmployee = new EmployeeBean();
		boolean loggedIn = false;
		while (loggedIn == false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru = sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp = sc.nextLine();
			Properties prop = new Properties();
			String password="";
			
			try {
				prop.load(new FileReader("database.myproperties"));
				//username = prop.getProperty("adminusername")
				//password= prop.getProperty("adminpassword")
				password=prop.getProperty(ru);
			}catch (FileNotFoundException e) {
				System.out.println("Failed to find file");
			} catch (IOException e) {
				System.out.println("Failed");
			} 
			
			
			if (password!=null && password.equals(rp) == true) {
				thisEmployee = new EmployeeBean();
				loggedIn = true;
			} else {
				System.out.println("Invalid username or password");
			}
		}
		while (input != "EXIT") {
			AccountDaoImpl adi = new AccountDaoImpl();
			CustomerDaoImpl cdi = new CustomerDaoImpl();
			System.out.println("Press 1 to view all customers");
			System.out.println("Press 2 to view a customer's info");
			System.out.println("Press 3 to view all open applications for new accounts");
			System.out.println("Press 4 to accept or deny an application");
			System.out.println("Press 5 to view all accounts");
			System.out.println("Press 6 to cancel an account");
			System.out.println("Press 7 to deposit");
			System.out.println("Press 8 to withdraw");
			System.out.println("Press 9 to transfer");
			System.out.println("Press 10 to delete a user");
			System.out.println("Press 11 to create a new user");
			
			
			System.out.println("Press 0 to exit.");
			input = sc.nextLine();
			switch (input) {

			case "1":
				// This is the branch to view all customers
				System.out.println("All customers:");
				Collection<CustomerBean> allCustomers = cdi.getAllCustomers();
				for (CustomerBean x : allCustomers) {
					System.out.println("Username: " + x.getUsername());
					Collection<AccountBean> accounts = adi.getAccountByUser(x.getUsername());
					System.out.println("Number of accounts: " + accounts.size());
					int count = 0;
					for (AccountBean y : accounts) {
						count++;
						System.out.println("Account #" + count + ":");
						System.out.println("account number: " + y.getAccountNumber());
						System.out.println("account type: " + y.getAccountType());
						System.out.println("account balance: " + y.getAccountBalance());
					}
					System.out.println("---------------------------------");
				}
				System.out.println("---------------------------------");
				System.out.println("End of customers");
				break;

			case "2":
				// This is the branch to view a specific customer
				String name = "";
				CustomerBean cust = new CustomerBean();
				boolean found = false;
				while (found == false) {
					System.out.println("What is the customer's username? (Enter \"back\" to go back)");
					name = sc.nextLine();
					if (name.toLowerCase().equals("back")) {
						return;
					} else if (CheckDatabase.usernameAlreadyUsed(name)) {
						cust = cdi.getCustomerByUsername(name);
						found = true;
					} else {
						System.out.println("There is no customer with that username. Please try again.");
					}
				}
				System.out.println("Customer's info:");
				System.out.println("Username: " + cust.getUsername());
				Collection<AccountBean> accounts = adi.getAccountByUser(cust.getUsername());
				System.out.println("Number of accounts: " + accounts.size());
				int count = 0;
				for (AccountBean y : accounts) {
					count++;
					System.out.println("Account #" + count + ":");
					System.out.println("account number: " + y.getAccountNumber());
					System.out.println("account type: " + y.getAccountType());
					System.out.println("account balance: " + y.getAccountBalance());
				}
				System.out.println("---------------------------------");
				System.out.println("End of info.");
				break;

			case "3":
				// This is the branch to view all open applications for accounts
				ArrayList<AccountBean> allOpenAccounts = adi.getAllApplications();
				for (AccountBean x : allOpenAccounts) {
					System.out.println("account number: " + x.getAccountNumber());
					System.out.println("account type: " + x.getAccountType());
					System.out.println("account balance: " + x.getAccountBalance());
					System.out.println("Users with access to this account:");
					int counting = 0;
					for (String y : x.getUsers()) {
						counting++;
						System.out.println("User #" + counting + ":");
						System.out.println("user name: " + y);
					}
					System.out.println("---------------------------------");

				}
				System.out.println("---------------------------------");
				System.out.println("End of open applications");
				break;

			case "4":
				// This is the branch to approve or deny open accounts
				int number = 0;
				AccountBean acct = new AccountBean();
				boolean foundit = false;
				while (foundit == false) {
					System.out.println("What is the account number? (Enter \"back\" to go back)");
					String num = sc.nextLine();
					number = Integer.parseInt(num);
					if (num.equals("back")) {
						return;
					} else {
						number=Integer.parseInt(num);
						if(CheckDatabase.openAcctNumAlreadyUsed(number)) {
							acct=adi.getApplicationByAccountNumber(number);
							foundit=true;
							
						}else {
							System.out.println("There is no account with that number. Please try again.");
						}
					}
				}
				System.out.println("Account found");
				System.out.println("account number: " + acct.getAccountNumber());
				System.out.println("account type: " + acct.getAccountType());
				System.out.println("account balance: " + acct.getAccountBalance());
				System.out.println("Users with access to this account:");
				int counting = 0;
				for (String y : acct.getUsers()) {
					counting++;
					System.out.println("User #" + counting + ":");
					System.out.println("user name: " + y);
				}
				System.out.println("---------------------------------");
				boolean done = false;
				while (done == false) {

					System.out.println("Press 1 to approve account");
					System.out.println("Press 2 to deny account");
					System.out.println("Press 3 to abort.");
					String input2 = sc.nextLine();
					switch (input2) {
					case "1":
						thisEmployee.approveAccount(acct);
						done = true;
						break;
					case "2":
						thisEmployee.denyAccount(acct);
						done = true;
						break;
					case "3":
						done = true;
						break;
					default:
						System.out.println("Sorry, that is not a valid selection. Please try again");
					}
				}
				break;

			case "5":
				// This is the branch to view all accounts that have been approved
				System.out.println("All active accounts:");
				ArrayList<AccountBean> allAccounts = adi.getAllAccounts();
				for (AccountBean x : allAccounts) {
					System.out.println("account number: " + x.getAccountNumber());
					System.out.println("account type: " + x.getAccountType());
					System.out.println("account balance: " + x.getAccountBalance());
					System.out.println("Users with access to this account:");
					int countin = 0;
					for (String y : x.getUsers()) {
						countin++;
						System.out.println("User #" + countin + ":");
						System.out.println("user name: " + y);
					}
					System.out.println("---------------------------------");
				}
				System.out.println("---------------------------------");
				System.out.println("End of accounts list");
				break;

			case "6":
				// this is the branch to cancel accounts
				System.out.println("Enter account number you want to cancel. (Enter \"back\" to go back)");
				String r1 = sc.nextLine();
				if (r1.toLowerCase().equals("back")) {
					return;
				} else if (CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(r1))) {
					adi.removeAccountFromDatabase(Integer.parseInt(r1));
					System.out.println("Account removed");
				} else {
					System.out.println("That account number is not in our records.");
				}
				break;

			case "7":
				// This is the DEPOSIT branch
				System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
				String rr1 = sc.nextLine();
				if (rr1.toLowerCase().equals("back")) {
					return;
				} else if (CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(rr1))) {
					AccountBean acct1 = CheckDatabase.getThisAccount(Integer.parseInt(rr1));
					System.out.println("Enter deposit amount.");
					String rr2 = sc.nextLine();
					double amount = Double.parseDouble(rr2);
					if (amount > 0) {
						System.out.println(acct1.deposit(amount));
						adi.updateAccount(acct1);
						System.out.println("Deposit successful.");
					} else {
						System.out.println("That is not a valid number");
					}
				} else {
					System.out.println("That account number is not in our records.");
				}
				break;

			case "8":
				// This is the WITHDRAW branch
				System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
				String r3 = sc.nextLine();
				if (r3.toLowerCase().equals("back")) {
					return;
				} else if (CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(r3))) {
					AccountBean acct1 = CheckDatabase.getThisAccount(Integer.parseInt(r3));
					System.out.println("Enter withdraw amount.");
					String r4 = sc.nextLine();
					double amount = Double.parseDouble(r4);
					if (amount > 0) {
						try {
							System.out.println(acct1.withdraw(amount));
							adi.updateAccount(acct1);
							System.out.println("Withdraw successful.");
						} catch (NotEnoughFundsException e) {
							System.out.println(e.getMessage());
						}
						
					} else {
						System.out.println("That is not a valid amount");
					}
				} else {
					System.out.println("That account number is not in our records.");
				}
				break;

			case "9":
				// This is the TRANSFER branch
				AccountBean fromAcct = new AccountBean();
				AccountBean toAcct = new AccountBean();
				double amt = 0;
				boolean foundFirst = false;
				while (foundFirst == false) {
					System.out.println("Enter account number you want to transfer from. (Enter \"back\" to go back)");
					String r5 = sc.nextLine();
					if (r5.toLowerCase().equals("back")) {
						return;
					} else if (CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(r5))) {
						fromAcct = CheckDatabase.getThisAccount(Integer.parseInt(r5));
						System.out.println("Enter transfer amount.");
						String r6 = sc.nextLine();
						amt = Double.parseDouble(r6);
						if (amt > 0) {
							foundFirst = true;
						} else {
							System.out.println("That is not a valid amount");
						}
					} else {
						System.out.println("That account number is not in our records.");
					}
				}
				boolean foundSecond = false;
				while (foundSecond == false) {
					System.out.println("Enter account number you want to transfer to. (Enter \"back\" to go back)");
					String r7 = sc.nextLine();
					if (r7.toLowerCase().equals("back")) {
						return;
					} else if (CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(r7))) {
						toAcct = CheckDatabase.getThisAccount(Integer.parseInt(r7));
						foundSecond = true;
					} else {
						System.out.println("That account number is not in our records.");
					}
				}
				try {
					fromAcct.withdraw(amt);
					adi.updateAccount(fromAcct);
					toAcct.deposit(amt);
					adi.updateAccount(toAcct);
					System.out.println("Transfer successful.");
				} catch (NotEnoughFundsException e) {
					System.out.println(e.getMessage());
				}
				break;

				
			case "10":
				// this is the branch to delete a user
				System.out.println("Enter username you want to delete. (Enter \"back\" to go back)");
				String response = sc.nextLine();
				if (response.toLowerCase().equals("back")) {
					return;
				} else if (CheckDatabase.usernameAlreadyUsed(response)) {
					cdi.removeCustomerFromDatabase(response);
					System.out.println("User removed");
				} else {
					System.out.println("That name is not in our records.");
				}
				break;
				
				
			case "11":
				// this is the branch to create a new user
				boolean uniqueName = false;
				while (uniqueName == false) {
					String resp;
					System.out.println("(Enter \"back\" to go back)");
					System.out.println("What would you like the username to be?");
					resp = sc.nextLine();
					if (resp.toLowerCase().equals("back")) {
						continue;
					} else if (CheckDatabase.usernameAlreadyUsed(resp) == false) {
						String resp2;

						System.out.println("What would you like the password to be? ");
						resp2 = sc.nextLine();
						CustomerBean newUser = new CustomerBean(resp, resp2);
						CustomerDaoImpl cdi1 = new CustomerDaoImpl();
						cdi1.addCustomerToDatabase(newUser);
						System.out.println("New user info added.");
						uniqueName = true;
					} else {
						System.out.println("Sorry, that username has been taken.");
					}
				}
				
				
			case "0":
				input = "EXIT";
				break;

			

			default:
				System.out.println("Sorry, that is not a valid selection. Please try again");

			}

		}

	}

}
