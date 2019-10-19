package com.revature.mainscreen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.revature.storage.AccountStorage;
import com.revature.storage.CustomerStorage;
import com.revature.storage.EmployeeLoginInfo;
import com.revature.storage.EmployeeStorage;
import com.revature.storage.OpenApplications;
import com.revature.user.Account;
import com.revature.user.Customer;
import com.revature.user.Employee;

public class AdminLoop {
	public static void employeeLoop(Scanner sc) {
		// Start by entering username and the password
		String input = "";
		Employee thisEmployee = new Employee();
		boolean loggedIn = false;
		while (loggedIn == false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru = sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp = sc.nextLine();
			if (EmployeeLoginInfo.checkEmployee(ru, rp) == true) {
				thisEmployee = EmployeeStorage.getThisEmployee(ru);
				loggedIn = true;
			} else {
				System.out.println("Invalid username or password");
			}
		}
		while (input != "EXIT") {
			System.out.println("Press 1 to view all customers");
			System.out.println("Press 2 to view a customer's info");
			System.out.println("Press 3 to view all open applications for new accounts");
			System.out.println("Press 4 to accept or deny an application");
			System.out.println("Press 5 to view all accounts");
			System.out.println("Press 6 to cancel an account");
			System.out.println("Press 7 to deposit");
			System.out.println("Press 8 to withdraw");
			System.out.println("Press 9 to transfer");
			System.out.println("Press 0 to exit.");
			input = sc.nextLine();
			switch (input) {

			case "1":
				// This is the branch to view all customers
				System.out.println("All customers:");
				Collection<Customer> allCustomers = CustomerStorage.getAllCustomers().values();
				for (Customer x : allCustomers) {
					System.out.println("Username: " + x.getUsername());
					Collection<Account> accounts = x.getOnlyAccounts();
					System.out.println("Number of accounts: " + accounts.size());
					int count = 0;
					for (Account y : accounts) {
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
				Customer cust = new Customer();
				boolean found = false;
				while (found == false) {
					System.out.println("What is the customer's username? (Enter \"back\" to go back)");
					name = sc.nextLine();
					if (name.toLowerCase().equals("back")) {
						return;
					} else if (CustomerStorage.getAllCustomers().containsKey(name)) {
						cust = CustomerStorage.getThisCustomer(name);
						found = true;
					} else {
						System.out.println("There is no customer with that username. Please try again.");
					}
				}
				System.out.println("Customer's info:");
				System.out.println("Username: " + cust.getUsername());
				Collection<Account> accounts = cust.getOnlyAccounts();
				System.out.println("Number of accounts: " + accounts.size());
				int count = 0;
				for (Account y : accounts) {
					count++;
					System.out.println("Account #" + count + ":");
					System.out.println("account username: " + y.getAccountNumber());
					System.out.println("account type: " + y.getAccountType());
					System.out.println("account balance: " + y.getAccountBalance());
				}
				System.out.println("---------------------------------");
				System.out.println("End of info.");
				break;

				
			case "3":
				// This is the branch to view all open applications for accounts
				ArrayList<Account> allOpenAccounts = OpenApplications.getAllApplications();
				for (Account x : allOpenAccounts) {
					System.out.println("account number: " + x.getAccountNumber());
					System.out.println("account type: " + x.getAccountType());
					System.out.println("account balance: " + x.getAccountBalance());
					System.out.println("Users with access to this account:");
					int counting = 0;
					for (Customer y : x.getUsers()) {
						counting++;
						System.out.println("User #" + counting + ":");
						System.out.println("user name: " + y.getUsername());
					}
					System.out.println("---------------------------------");

				}
				System.out.println("---------------------------------");
				System.out.println("End of open applications");
				break;

				
			case "4":
				// This is the branch to approve or deny open accounts
				int number = 0;
				Account acct = new Account();
				boolean foundit = false;
				while (foundit == false) {
					System.out.println("What is the account number? (Enter \\\"back\\\" to go back)");
					String num = sc.nextLine();
					number = Integer.parseInt(num);
					if (num.equals("back")) {
						return;
					} else {
						ArrayList<Account> allAccounts = OpenApplications.getAllApplications();
						boolean exists = false;
						for (Account x : allAccounts) {
							if (x.getAccountNumber() == number) {
								acct = x;
								foundit = true;
								exists = true;
							}

						}
						if (exists == false) {
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
				for (Customer y : acct.getUsers()) {
					counting++;
					System.out.println("User #" + counting + ":");
					System.out.println("user name: " + y.getUsername());
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
				System.out.println("All active accounts:");
				ArrayList<Account> allAccounts = AccountStorage.getAllAccounts();
				for (Account x : allAccounts) {
					System.out.println("account number: " + x.getAccountNumber());
					System.out.println("account type: " + x.getAccountType());
					System.out.println("account balance: " + x.getAccountBalance());
					System.out.println("Users with access to this account:");
					int countin = 0;
					for (Customer y : x.getUsers()) {
						countin++;
						System.out.println("User #" + countin + ":");
						System.out.println("user name: " + y.getUsername());
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
				} else if (AccountStorage.getAllAccountNumbers().contains(Integer.parseInt(r1))) {
					Account account = AccountStorage.getThisAccount(Integer.parseInt(r1));
					AccountStorage.removeAccount(account);
					for(Customer c : CustomerStorage.getOnlyCustomers()) {
						for(int a : c.getAccountNumbers()) {
							if(account.getAccountNumber()==a) {
								c.removeAccount(a);
							}
						}
					}
				}
				else {
					System.out.println("That account number is not in our records.");
				}
				break;

				
			case "7":
				// This is the DEPOSIT branch
				System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
				String rr1 = sc.nextLine();
				if (rr1.toLowerCase().equals("back")) {
					return;
				} else if (AccountStorage.getAllAccountNumbers().contains(Integer.parseInt(rr1))) {
					Account acct1 = AccountStorage.getThisAccount(Integer.parseInt(rr1));
					System.out.println("Enter deposit amount.");
					String rr2 = sc.nextLine();
					double amount = Double.parseDouble(rr2);
					if (amount > 0) {
						System.out.println(acct1.deposit(amount));
						System.out.println("Deposit successful.");
					} else {
						System.out.println("That is not a valid number");
					}
				}
				else {
					System.out.println("That account number is not in our records.");
				}
				break;

				
			case "8":
				// This is the WITHDRAW branch
				System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
				String r3 = sc.nextLine();
				if (r3.toLowerCase().equals("back")) {
					return;
				} else if (AccountStorage.getAllAccountNumbers().contains(Integer.parseInt(r3))) {
					Account acct1 = AccountStorage.getThisAccount(Integer.parseInt(r3));
					System.out.println("Enter withdraw amount.");
					String r4 = sc.nextLine();
					double amount = Double.parseDouble(r4);
					if (amount > 0 && amount <= acct1.getAccountBalance()) {
						System.out.println(acct1.withdraw(amount));
						System.out.println("Withdraw successful.");
					} else {
						System.out.println("That is not a valid number");
					}
				}
				else {
					System.out.println("That account number is not in our records.");
				}
				break;
				
				
			case "9":
				// This is the TRANSFER branch
				Account fromAcct=new Account();
				Account toAcct=new Account();
				double amt=0;
				boolean foundFirst=false;
				while(foundFirst==false) {
					System.out.println("Enter account number you want to transfer from. (Enter \"back\" to go back)");
					String r5 = sc.nextLine();
					if (r5.toLowerCase().equals("back")) {
						return;
					} else if (AccountStorage.getAllAccountNumbers().contains(Integer.parseInt(r5))) {
						fromAcct = AccountStorage.getThisAccount(Integer.parseInt(r5));
						System.out.println("Enter transfer amount.");
						String r6 = sc.nextLine();
						amt = Double.parseDouble(r6);
						if (amt > 0 && amt <= fromAcct.getAccountBalance()) {
							foundFirst=true;
						} else {
							System.out.println("That is not a valid number");
						}
					}
					else {
						System.out.println("That account number is not in our records.");
					}
				}
				boolean foundSecond=false;
				while(foundSecond==false) {
					System.out.println("Enter account number you want to transfer to. (Enter \"back\" to go back)");
					String r7 = sc.nextLine();
					if (r7.toLowerCase().equals("back")) {
						return;
					} else if (AccountStorage.getAllAccountNumbers().contains(Integer.parseInt(r7))) {
						toAcct = AccountStorage.getThisAccount(Integer.parseInt(r7));
						foundSecond=true;
					}
					else {
						System.out.println("That account number is not in our records.");
					}
				}
				fromAcct.withdraw(amt);
				toAcct.deposit(amt);
				System.out.println("Transfer successful.");
				break;
				
				
			case "0":
				input = "EXIT";
				// write to file
				break;
			default:
				System.out.println("Sorry, that is not a valid selection. Please try again");

			}

		}

	}

}
