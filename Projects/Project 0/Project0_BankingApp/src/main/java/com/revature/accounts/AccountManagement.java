package com.revature.accounts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.programstart.ProgramStart;

public class AccountManagement {
	
	//creates scanner for user input
	static Scanner input = new Scanner(System.in);
	
	public static final String accountFile = "Account.txt";
	public static List<Account> accountList = new ArrayList<Account>();
	
	//Write accounts to file
	public static void writeAccountFile() {
		try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(accountFile));){
			objectOut.writeObject(accountList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//Read accounts to file
	@SuppressWarnings("unchecked")
	public static void readAccountFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));){
			accountList = (ArrayList<Account>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//Create a checking account for a single person
	public static void CreateSinglePersonCheckingAccount(String username) {
		System.out.println("Please enter initial deposit ammount: ");
		accountList.add(new Account(0, username, input.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a Joint checking account between two people
	public static void CreateJointCheckingAccount(String usernameA, String usernameB) {
		System.out.println("Please enter initial deposit ammount.");
		accountList.add(new Account(0, usernameA+"/"+usernameB, input.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
	//Create a one person savings account.
	public static void CreateSinglePersonSavingsAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		accountList.add(new Account(1, username, input.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a joint savings account between two people.
	public static void CreateJointSavingsAccount(String usernameA, String usernameB) {
		readAccountFile();
		System.out.println("Please enter initial deposit ammount.");
		accountList.add(new Account(1, usernameA+"/"+usernameB, input.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
	//Transfer funds between accounts
	@SuppressWarnings("unused")
	public static void transferFunds(String Username) {
		System.out.println("Select account to transfer from!");
		readAccountFile();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains(Username)) {
				System.out.println(i+": "+accountList.get(i).getAccountType());
			}
			Double holdTempBalance;//Holds account balance of current amount.
			if (i == input.nextInt()) {
				System.out.println("Which account would you like to transfer to?");
				for (int j = 0; j < accountList.size(); j++) {
					System.out.println(j+": "+accountList.get(i).getAccountType());
					if(j==input.nextInt()) {
						System.out.println("How much would like to transfer?");
						holdTempBalance = accountList.get(j).getAccountBalance();
						if (input.nextDouble() > accountList.get(i).getAccountBalance()) {
							accountList.get(j).setAccountBalance(accountList.get(j).getAccountBalance()+input.nextDouble());//adds funds to account
							accountList.get(i).setAccountBalance(accountList.get(i).getAccountBalance()-input.nextDouble());//Remove funds from account.
							System.out.println("Funds added successfuly from your "+accountList.get(i).getAccountType()+"to your "+accountList.get(j).getAccountType());
							writeAccountFile();
							ProgramStart.customerMenu(Username);
						}
					}
				}
			}
		}
	}
	public static void getAccountsByName(String username) {
		readAccountFile();
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println("********************************************************************************************************************");
			System.out.println(accountList.get(i).toString());
			System.out.println("********************************************************************************************************************");
		}
	}
}
