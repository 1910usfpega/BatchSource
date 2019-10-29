package com.revature.ui;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import com.revature.beans.Account;
import com.revature.beans.Person;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.PersonDaoImpl;

public class ReturningCustomer {
	public static  void returningLoop(Scanner in) {
		String un = "";
		AccountDaoImpl adi = new AccountDaoImpl();
		PersonDaoImpl pdi = new PersonDaoImpl();
		Person opCust = new Person();
		boolean identity = false;
		while (identity == false) {
			System.out.println("Enter User Name:");
			un = in.nextLine();
			System.out.println("Enter Password:");
			String pw = in.nextLine();
			if(pdi.checkUser(un, pw)== true	){			
				try {
					opCust =  pdi.getPersonByUN(un);
					 System.out.println("Welcome "+opCust.getFirstName());
						identity = true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {System.out.println("User Name/Pass word combination is invalid.");}
		} 
		try {
			System.out.println(adi.getAccountsbyUID(opCust.getUserId()));
		} catch (SQLException e1) {e1.printStackTrace();}
		
		int putIn=0;
		boolean loggedIn = true;
		while (loggedIn == true) {
		while(putIn!= 5) {
		System.out.println("Press 1 to create an account");
	
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to deposit");
		System.out.println("Press 4 to close an account");
		System.out.println("Press 5 to exit");
		putIn = in.nextInt();

		
		switch(putIn) {
			case 1:
				//logic for applying for an account
				boolean s = false;
				String type;
				while(s == false) {
				
				System.out.println("what kind of account would you like to open? C/S");
				type=in.nextLine();
				if(type.equals("c")) {
					String acctType ="Checking";
					Account acct = new Account(acctType, opCust.getUserId());
					try {
						adi.insertAccount(acct);
						System.out.println("Account created");
						s=true;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if(type.equals("s")) {
					String acctType = "Savings";
					Account acct = new Account(acctType, opCust.getUserId());
					try {
						adi.insertAccount(acct);
						System.out.println("Account created");
						s=true;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}else{System.out.println("enter either c or s");}
				}
				try {
					System.out.println(adi.getAccountsbyUID(opCust.getUserId()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				//System.out.println("Press 1 to exit");
				break;
			case 2:
				boolean withdrawal = false;
				while(withdrawal ==false) {
					
			
				
				try {
					System.out.println("Select an account by ID# for this withdrawal");
					int acctId =in.nextInt();
					Account opAcc = adi.getAccountById(acctId);
					System.out.println("Account found.");
					System.out.println("Input withdrawal amount ");
					double withdraw = in.nextInt();
					
					
					if (withdraw<=opAcc.getBalance()){
						opAcc.withdraw(withdraw);
						adi.updateAccount(opAcc);
						System.out.println("Withdrawal Successful");
						System.out.println("Remaining balance: "+opAcc.getBalance());
						withdrawal = true;
						}
					else {
						System.out.println("this amount exceeds available funds");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					}
				break;
			case 3:
				boolean deposit = false;
				while(deposit ==false) {
					try {
						System.out.println("Select an account by ID# for this deposit");
						int acctId =in.nextInt();
						Account opAcc = adi.getAccountById(acctId);
						System.out.println("Account found.");
						System.out.println("Input deposit amount ");
						double dep = in.nextInt();
						if (dep>0){
							opAcc.deposit(dep);
							adi.updateAccount(opAcc);
							System.out.println("Deposit Successful");
							System.out.println("Adjusted balance: "+opAcc.getBalance());
							deposit = true;
							}
						else {
							System.out.println("Negative funds cannot be added to an account");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				break;
			case 4:
				boolean close = false;
				while(close ==false) {

				try {
					System.out.println("Select an account by ID# to close");
					int acctId =in.nextInt();
					Account opAcc = adi.getAccountById(acctId);
					System.out.println("Account found.");
					System.out.println("Before closing this account, you must withdraw "+opAcc.getBalance()+"dollars.");
					System.out.println("Would you like to perform this withdrawal now? \n y/n");
					String decision = in.nextLine();
					if(decision.equals("y")) {
						opAcc.withdraw(opAcc.getBalance());
						adi.updateAccount(opAcc);
						System.out.println("Withdrawal Successful, no funds remaining");
						System.out.println("Remaining balance: "+opAcc.getBalance());
						adi.removeAcct(opAcc.getAccountId());
						System.out.println("Account"+opAcc.getAccountId()+" closed");
					}else {break;}
				} catch (SQLException e1) {e1.printStackTrace();}
				}
					
									break;
			case 5:
				System.out.println("Logging out, returning to mainscreen");
				loggedIn = false;
				return;
			default: System.out.println("Please enter a valid input.");
			break;
		
		}
	
		}
	}
	}
		}
		

