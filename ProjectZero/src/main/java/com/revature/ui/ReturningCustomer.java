package com.revature.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.storage.MotherLoad;

public class ReturningCustomer {
	public static  void returningLoop(Scanner in, MotherLoad ml) {
		String un = "";
		AccountDaoImpl adi = new AccountDaoImpl();
		Customer opCust = new Customer();
		boolean identity = false;
		while (identity == false) {
			System.out.println("Enter User Name:");
			un = in.nextLine();
			System.out.println("Enter Password:");
			String pw = in.nextLine();
			if(ml.checkLogInfo(un, pw)== true	& opCust instanceof Customer) {
//		for (String i : ml.usersByLogInInfo()) {
//			//custStored.containsKey(username) && custStored.get(username).equals(password)
//			if(i.equals(ml.getOneUser(un))&& i.equals(ml.getOneUser(un).getPassword())
				
				opCust = (Customer) ml.getOneUser(un);
					 System.out.println("Welcome "+ml.getOneUser(un).getFirstName());
						identity = true;	
			} else {
				System.out.println("User Name is invalid.");
			}
		} 
	
	
		int putIn = 0;
		while(putIn!= 5) {
		System.out.println("Press 1 to create an account");
		
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to deposit");
		System.out.println("Press 4 to transfer funds");
		System.out.println("Press 5 to exit");
		putIn = in.nextInt();
		HashMap<Integer, Account> accounts = opCust.getAccounts();
		for(Account i: accounts.values()) {
			System.out.println("AccountId: "+ i.getAccountId());
			System.out.println("Account Balance: "+i.getBalance());
			
		}
		
		switch(putIn) {
			case 1:
				//logic for applying for an account
				boolean s = false;
				while(s == false) {
				String type;
				System.out.println("what kind of account would you like to open? C/S");
				type=in.nextLine();
				if(type.equals("c")) {
					String acctType ="Checking";
					Account acct = new Account(acctType);
					ml.addAcct(acct);
					acct.addOwner(opCust);
					opCust.addAccount(id, acct);
					System.out.println("Account created");
					s=true;
				}
				if(type.equals("s")) {
					String acctType = "Savings";
					Account acct = new Account(acctType);
					acct.addOwner(opCust);
					ml.addAcct(acct);
					System.out.println("Account created");
					s=true;
				}else{System.out.println("enter either c or s");}
				}
				
				
				
				//System.out.println("Press 1 to exit");
				break;
			case 2:
				boolean withdrawal = false;
				while(withdrawal ==false) {
					
			
				System.out.println("Select an account by ID# for this withdrawal");
				int acctId =in.nextInt();
				HashMap<Integer, Account> accountIds = opCust.getAccounts();
				for(Integer i: accountIds.keySet()) {
					if( i ==acctId) {
						Account acct = adi.getAccountById(acctId);
						//Account acct = ml.showOneAcct(i);
						System.out.println("Input withdrawal amount ");
						double withdraw = in.nextInt();
						double balance = acct.getBalance();
						if (withdraw<=balance){
							acct.withdraw(withdraw);
							withdrawal = true;
							}
						else {
							System.out.println("this amount exceeds available funds");
						}
						

					}
				}
				}
				break;
			case 3:
				boolean deposit = false;
				while(deposit ==false) {
				System.out.println("Select an account by ID# for this deposit");
				int acctId =in.nextInt();
				HashMap<Integer, Account> accountIds = opCust.getAccounts();
				for(Integer i: accountIds.keySet()) {
					if( i ==acctId) {
						Account acct = ml.showOneAcct(i);
						System.out.println("Input deposit amount ");
						double dep = in.nextInt();
						double balance = acct.getBalance();
						if (dep<=balance){
							acct.deposit(dep);
							deposit = true;
							}
						else {
							System.out.println("this amount exceeds available funds");
						}
						

					}
				}
				}
				break;
			case 4:
				boolean trans2 = false;
				double transfer;
				System.out.println("Input transfer amount ");
				 transfer = in.nextInt();
				while(trans2 ==false) {
					
			
				System.out.println("Select an account by ID# to transfer money from");
				int acctId =in.nextInt();
				HashMap<Integer, Account> accountIds = opCust.getAccounts();
				for(Integer i: accountIds.keySet()) {
					if( i ==acctId) {
						Account acct = ml.showOneAcct(i);

						double balance = acct.getBalance();
						if (transfer<=balance){
							acct.withdraw(transfer);
							continue;
							//trans2 = true;
							}else {System.out.println("this amount exceeds available funds");}
					}
				}
				}
					
			
				System.out.println("Select an account by ID# to transfer to");
				int acctId =in.nextInt();
				HashMap<Integer, Account> accountIds = opCust.getAccounts();
				for(Integer i: accountIds.keySet()) {
					if( i ==acctId) {
						Account acct = ml.showOneAcct(i);
						System.out.println("transferring "+transfer +" dollars");
						acct.deposit(transfer);
							trans2 = true;
							}
						else {
							System.out.println("this amount exceeds available funds");
						}
						

					}
				
				
				break;
			case 5:
				
				return;
		
		
	
		}
	}
}}
		

