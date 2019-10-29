package com.revature.mainscreen;

import java.util.ArrayList;
import java.util.Scanner;
import com.revature.beans.AccountBean;
import com.revature.beans.CustomerBean;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.exceptions.NotEnoughFundsException;
import com.revature.util.CheckDatabase;

public class CustomerLoop {

	public static void customerLoop(Scanner sc) {
		// Start by entering username and the password
		String input="";
		CustomerBean thisUser=new CustomerBean();
		boolean loggedIn=false;
		while (loggedIn==false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru=sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			if (CheckDatabase.usernameAlreadyUsed(ru)==true) {
				System.out.println("Enter your password.");
				String rp=sc.nextLine();
				if (CheckDatabase.checkUser(ru, rp)==true) {
					thisUser=CheckDatabase.getThisCustomer(ru);
					loggedIn=true;
			}
			
			}else {
				System.out.println("Sorry, that username is not in our database.");
				break;
			}
		}
		AccountDaoImpl adi= new AccountDaoImpl();
		ArrayList<AccountBean> accounts=adi.getAccountByUser(thisUser.getUsername());
		System.out.println("Your account info:");
		System.out.println("Username: "+thisUser.getUsername());
		System.out.println("Number of accounts: "+accounts.size());
		int count=0;
		for(AccountBean y:accounts) {
			count++;
			System.out.println("Account #"+count+":");
			System.out.println("account number: "+y.getAccountNumber());
			System.out.println("account type: "+y.getAccountType());
			System.out.println("account balance: "+y.getAccountBalance());
			
		}
		System.out.println("---------------------------------");
		while (input != "EXIT") {
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to transfer");
			System.out.println("Press 4 to apply for a new account");
			System.out.println("Press 5 to close an empty account");
			System.out.println("Press 6 to view transaction history");
			System.out.println("Press 7 to exit.");
			input = sc.nextLine();
			switch (input) {
			
			
			case "1":
				// This is the DEPOSIT branch
				if(accounts.size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					
					//ArrayList<Integer> set=thisUser.getMyAccounts();
					boolean found=false;
					while (found==false){
						System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							break;
						}else if(CheckDatabase.checkUserOwnsAccount(thisUser.getUsername(),Integer.parseInt(r1))) {
							AccountBean acct=CheckDatabase.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter deposit amount.");
							String r2=sc.nextLine();
							double amount = Double.parseDouble(r2);
							if (amount>0) {      
								System.out.println(acct.deposit(amount));
								adi.updateAccount(acct);
								System.out.println("Deposit successful.");
								adi.addTransactionHistory(thisUser.getUsername(), acct.getAccountNumber(), "deposit", amount, acct.getAccountBalance());
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
				
				
			case "2":
				// This is the WITHDRAW branch
				if(accounts.size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					boolean found=false;
					while (found==false){
						System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							break;
						}else if(CheckDatabase.checkUserOwnsAccount(thisUser.getUsername(),Integer.parseInt(r1))) {
							AccountBean acct=CheckDatabase.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter withdraw amount.");
							String r2=sc.nextLine();
							double amount = Double.parseDouble(r2);
							if (amount>0){
								try {
									System.out.println(acct.withdraw(amount));
									adi.updateAccount(acct);
									System.out.println("Withdraw successful.");
									adi.addTransactionHistory(thisUser.getUsername(), acct.getAccountNumber(), "withdraw", amount, acct.getAccountBalance());
									found=true;
								} catch (NotEnoughFundsException e) {
									System.out.println(e.getMessage());
								}
								
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
				if(accounts.size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					AccountBean acct1=new AccountBean();
					AccountBean acct2=new AccountBean();
					double amount=0;
					boolean found=false;
					while (found==false){
						System.out.println("Enter account number you want to withdraw from. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							break;
						}else if(CheckDatabase.checkUserOwnsAccount(thisUser.getUsername(),Integer.parseInt(r1))) {
							acct1=CheckDatabase.getThisAccount(Integer.parseInt(r1));
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
						System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							break;
						}else if(CheckDatabase.acctNumAlreadyUsed(Integer.parseInt(r1))) {
							acct2=CheckDatabase.getThisAccount(Integer.parseInt(r1));
							found=true;
							
						}else {
							System.out.println("Sorry, that's not an existing account number");
						}
					}
					try {
						acct1.withdraw(amount);
						adi.updateAccount(acct1);
						acct2.deposit(amount);
						adi.updateAccount(acct2);
						adi.addTransactionHistory(thisUser.getUsername(), acct1.getAccountNumber(), "withdraw", amount, acct1.getAccountBalance());
						adi.addTransactionHistory(thisUser.getUsername(), acct2.getAccountNumber(), "deposit", amount, acct2.getAccountBalance());
						System.out.println("Transfer successful.");
					} catch (NotEnoughFundsException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
				
			case "4":
				// This is the branch to apply for a new account
				boolean valid=false;
				ArrayList<String> customers=new ArrayList<String>();
				customers.add(thisUser.getUsername());
				String accountType="";
				while (valid==false) {
					System.out.println("New account: ");
					System.out.println("Press 1 for checking,");
					System.out.println("Press 2 for savings ");
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
					}else if(CheckDatabase.usernameAlreadyUsed(r5)==true) {
						customers.add(r5);
						System.out.println("Customer added to application");
					}else {
						System.out.println("Sorry, could not find that username. Please try again.");
					}
				}
				AccountBean newAccount=new AccountBean(accountType,customers);
				//thisUser.addApplication(newAccount);
				AccountDaoImpl adi2=new AccountDaoImpl();
				adi2.addApplicationToDatabase(newAccount);
				
				System.out.println("Application submitted. Awaiting approval from an employee.");
				break;
				
				
			case "5":
				// This is the branch to close an account
				if(accounts.size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					boolean found=false;
					while (found==false){
						System.out.println("Enter account number you want to delete. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							break;
						}else if(CheckDatabase.checkUserOwnsAccount(thisUser.getUsername(),Integer.parseInt(r1))) {
							AccountBean acct=CheckDatabase.getThisAccount(Integer.parseInt(r1));
							if (acct.getAccountBalance()>0.0) {
								System.out.println("Sorry, you still have money in that account.");
							}else {
								adi.removeAccountFromDatabase(Integer.parseInt(r1));
								System.out.println("Account removed");
							}
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
				}
				break;
				
			case "6":
				System.out.println("Your transaction history");
				adi.viewTransactionHistory(thisUser.getUsername());
				break;
				
			case "7":
				input="EXIT";
				break;
				
				
			default:
				System.out.println("Sorry, that is not a valid selection");
			}
		}
	}
}
