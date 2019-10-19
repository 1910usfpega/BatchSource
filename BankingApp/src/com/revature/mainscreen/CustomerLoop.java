package com.revature.mainscreen;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import com.revature.storage.OpenApplications;
import com.revature.storage.CustomerStorage;
import com.revature.storage.LoginInfo;
import com.revature.user.Account;
import com.revature.user.Customer;

public class CustomerLoop {

	public static void customerLoop(Scanner sc) {
		// Start by entering username and the password
		String input="";
		Customer thisUser=new Customer();
		boolean loggedIn=false;
		while (loggedIn==false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru=sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp=sc.nextLine();
			if (LoginInfo.checkUser(ru, rp)==true) {
				thisUser=CustomerStorage.getThisCustomer(ru);
				loggedIn=true;
			}
		}
		while (input != "EXIT") {
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to transfer");
			System.out.println("Press 4 to apply for a new account");
			System.out.println("Press 5 to exit.");
			input = sc.nextLine();
			switch (input) {
			
			case "1":
				// This is the DEPOSIT branch
				if(thisUser.getMyAccounts().size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					Set<Integer> set=thisUser.getAccountNumbers();
					boolean found=false;
					while (found==false){
						System.out.println("Your accounts:");
						System.out.println(set);
						System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							return;
						}else if(set.contains(Integer.parseInt(r1))) {
							Account acct=thisUser.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter deposit amount.");
							String r2=sc.nextLine();
							double amount = Double.parseDouble(r2);
							if (amount>0) {
								System.out.println(thisUser.deposit(amount, acct));
								System.out.println("Deposit successful.");
							}else {
								System.out.println("That is not a valid number");
							}
							
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
				}
				break;
				
				
			case "2":
				// This is the WITHDRAW branch
				if(thisUser.getMyAccounts().size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					Set<Integer> set=thisUser.getAccountNumbers();
					boolean found=false;
					while (found==false){
						System.out.println("Your accounts:");
						System.out.println(set);
						System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							return;
						}else if(set.contains(Integer.parseInt(r1))) {
							Account acct=thisUser.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter withdraw amount.");
							String r2=sc.nextLine();
							double amount = Double.parseDouble(r2);
							if (amount>0 && amount<=acct.getAccountBalance()){
							//if (amount>0) {
								System.out.println(thisUser.withdraw(amount, acct));
								System.out.println("Withdraw successful.");
								found=true;
							}else {
								System.out.println("That is not a valid number");
							}
							
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
				}
				break;
				
			case "3":
				// This is the TRANSFER branch
				if(thisUser.getMyAccounts().size()<2) {
					System.out.println("Sorry, you don't have 2 or more accounts yet.");
				}else {
					Account acct1=new Account();
					Account acct2=new Account();
					double amount=0;
					Set<Integer> set=thisUser.getAccountNumbers();
					boolean found=false;
					while (found==false){
						System.out.println("Your accounts:");
						System.out.println(set);
						System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							return;
						}else if(set.contains(Integer.parseInt(r1))) {
							acct1=thisUser.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter transfer amount.");
							String r2=sc.nextLine();
							amount = Double.parseDouble(r2);
							if (amount>0 && amount<=acct1.getAccountBalance()){
								found=true;
							}else {
								System.out.println("That is not a valid number");
							}
							
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
					found=false;
					while (found==false){
						System.out.println("Your accounts:");
						System.out.println(set);
						System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							return;
						}else if(set.contains(Integer.parseInt(r1))) {
							acct2=thisUser.getThisAccount(Integer.parseInt(r1));
							found=true;
							
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
					acct1.withdraw(amount);
					acct2.deposit(amount);
					System.out.println("Transfer successful.");
				}
				break;
				
				
			case "4":
				boolean valid=false;
				ArrayList<Customer> customers=new ArrayList<Customer>();
				customers.add(thisUser);
				String accountType="";
				while (valid==false) {
					System.out.println("New account: ");
					System.out.println("Press 1 for checking,");
					System.out.println("Press 2 for savings, ");
					String r4=sc.nextLine();
					if(r4.contains("1")) {
						accountType="Checking";
						valid=true;
					}else if(r4.contains("2")) {
						accountType="Savings";
						valid=true;
					}else {
						System.out.println("Sorry that is not a valid selection");
					}
				}
				boolean done=false;
				while (done==false) {
					System.out.println("Are there any other users that will have access to this account?");
					System.out.println("If so, enter the customer's username,");
					System.out.println("otherwise leave blank and press enter.");
					String r5=sc.nextLine();
					if(r5.isEmpty()) {
						done=true;
					}else if(CustomerStorage.getAllCustomers().containsKey(r5)==true) {
						customers.add(CustomerStorage.getThisCustomer(r5));
						System.out.println("Customer added to application");
					}else {
						System.out.println("Sorry, could not find that username. Please try again.");
					}
				}
				Account newAccount=new Account(accountType,customers);
				OpenApplications.addApplication(newAccount);
				System.out.println("Application submitted. Awaiting approval from an employee.");
				break;
				
				
				
			case "5":
				input="EXIT";
				break;
				
			default:
				System.out.println("Sorry, that is not a valid selection");
				
			}

		}

	}


}
