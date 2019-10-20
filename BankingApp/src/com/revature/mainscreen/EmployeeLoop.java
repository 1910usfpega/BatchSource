package com.revature.mainscreen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.revature.storage.CustomerStorage;
import com.revature.storage.EmployeeLoginInfo;
import com.revature.storage.EmployeeStorage;
import com.revature.storage.OpenApplications;
import com.revature.user.Account;
import com.revature.user.Customer;
import com.revature.user.Employee;

public class EmployeeLoop {

	public static void employeeLoop(Scanner sc) {
		// Start by entering username and the password
		String input="";
		Employee thisEmployee=new Employee();
		boolean loggedIn=false;
		while (loggedIn==false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru=sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp=sc.nextLine();
			if (EmployeeLoginInfo.checkEmployee(ru, rp)==true) {
				thisEmployee=EmployeeStorage.getThisEmployee(ru);
				loggedIn=true;
			}else {
				System.out.println("Invalid username or password");
			}
		}
		while (input != "EXIT") {
			System.out.println("Press 1 to view all customers");
			System.out.println("Press 2 to view a customer's info");
			System.out.println("Press 3 to view all open applications for new accounts");
			System.out.println("Press 4 to accept or deny an application");
			System.out.println("Press 5 to exit.");
			input = sc.nextLine();
			switch (input) {
			
			
			case "1":
				Collection<Customer> allCustomers=CustomerStorage.getAllCustomers().values();
				for (Customer x : allCustomers) {
					System.out.println("Username: "+x.getUsername());
					Collection<Account> accounts = x.getOnlyAccounts();
					System.out.println("Number of accounts: "+accounts.size());
					int count=0;
					for(Account y:accounts) {
						count++;
						System.out.println("Account #"+count+":");
						System.out.println("account number: "+y.getAccountNumber());
						System.out.println("account type: "+y.getAccountType());
						System.out.println("account balance: "+y.getAccountBalance());
					}
					System.out.println("---------------------------------");
				}
				System.out.println("---------------------------------");
				System.out.println("End of customers");
				break;
				
			case "2":
				String name="";
				Customer cust=new Customer();
				boolean found=false;
				while (found==false) {
					System.out.println("What is the customer's username? (Enter \"back\" to go back)");
					name=sc.nextLine();
					if(name.toLowerCase().equals("back")){
						return;
					}else if(CustomerStorage.getAllCustomers().containsKey(name)) {
						cust=CustomerStorage.getThisCustomer(name);
						found=true;
					}else {
						System.out.println("There is no customer with that username. Please try again.");
					}
				}
				System.out.println("Customer's info:");
				System.out.println("Username: "+cust.getUsername());
				Collection<Account> accounts = cust.getOnlyAccounts();
				System.out.println("Number of accounts: "+accounts.size());
				int count=0;
				for(Account y:accounts) {
					count++;
					System.out.println("Account #"+count+":");
					System.out.println("account number: "+y.getAccountNumber());
					System.out.println("account type: "+y.getAccountType());
					System.out.println("account balance: "+y.getAccountBalance());
					//System.out.println("---------------------------------");
				}
				System.out.println("---------------------------------");
				System.out.println("End of info.");
				break;
				
				
			case "3":
				ArrayList<Account> allOpenAccounts=OpenApplications.getAllApplications();
				for (Account x : allOpenAccounts) {
					System.out.println("account number: "+x.getAccountNumber());
					System.out.println("account type: "+x.getAccountType());
					System.out.println("account balance: "+x.getAccountBalance());
					System.out.println("Users with access to this account:");
					int counting=0;
					for (Customer y:x.getUsers()) {
						counting++;
						System.out.println("User #"+counting+":");
						System.out.println("user name: "+y.getUsername());
					}
					System.out.println("---------------------------------");

				}
				System.out.println("---------------------------------");
				System.out.println("End of open applications");
				break;
				
				
			case "4":
				
				int number=0;
				Account acct=new Account();
				boolean foundit=false;
				while (foundit==false) {
					System.out.println("What is the account number? (Enter \\\"back\\\" to go back)");
					String num=sc.nextLine();
					number=Integer.parseInt(num);
					if(num.equals("back")){
						return;
					}else {
						ArrayList<Account> allAccounts=OpenApplications.getAllApplications();
						boolean exists=false;
						for(Account x:allAccounts) {
							if(x.getAccountNumber()==number) {
								acct=x;
								foundit=true;
								exists=true;
							}

						}
						if (exists==false) {
							System.out.println("There is no account with that number. Please try again.");
						}
					}
				}
				System.out.println("Account found");
				System.out.println("account number: "+acct.getAccountNumber());
				System.out.println("account type: "+acct.getAccountType());
				System.out.println("account balance: "+acct.getAccountBalance());
				System.out.println("Users with access to this account:");
				int counting=0;
				for (Customer y:acct.getUsers()) {
					counting++;
					System.out.println("User #"+counting+":");
					System.out.println("user name: "+y.getUsername());
				}
				System.out.println("---------------------------------");
				boolean done=false;
				while(done==false) {
					
					System.out.println("Press 1 to approve account");
					System.out.println("Press 2 to deny account");
					System.out.println("Press 3 to abort.");
					String input2=sc.nextLine();
					switch(input2) {
					case "1":
						thisEmployee.approveAccount(acct);
						done=true;
						break;
					case "2":
						thisEmployee.denyAccount(acct);
						done=true;
						break;
					case"3":
						done = true;
						break;
					default:
						System.out.println("Sorry, that is not a valid selection. Please try again");
					}
				}
				break;
				
				
			case "5":
				input="EXIT";
				//write to file
				break;
			default:
				System.out.println("Sorry, that is not a valid selection. Please try again");

			}

		}

	}
}
