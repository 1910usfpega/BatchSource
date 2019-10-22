package main.java.accounts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.management.loading.PrivateClassLoader;

import main.java.bean.Account;
import main.java.bean.User;
import main.java.programstart.ProgramStart;

public class AccountManagement {
	
	public static final String accountFile = "Account.txt";
	public static List<Account> accountList = new ArrayList<Account>();
	//Write accounts to file
	public static void writeAccountFile() {
		try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(accountFile));){
			objectOut.writeObject(accountList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Read accounts to file
	@SuppressWarnings("unchecked")
	public static void readAccountFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));){
			accountList = (ArrayList<Account>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Create a checking account for a single person
	public static void CreateSinglePersonCheckingAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		readAccountFile();
		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a Joint checking account between two people
	public static void CreateJointCheckingAccount(String usernameA, String usernameB) {
		readAccountFile();
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Checking", usernameA+"/"+usernameB, scanner.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
	//Create a one person savings account.
	public static void CreateSinglePersonSavingsAccount(String username) {
		readAccountFile();
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Savings", username, scanner.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a joint savings account between two people.
	public static void CreateJointSavingsAccount(String usernameA, String usernameB) {
		readAccountFile();
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Savings", usernameA+"/"+usernameB, scanner.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
	//Transfer funds between accounts
	public static void transferFunds(String Username) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select account to transfer from!");
		readAccountFile();
		int numOfaccounts = 0;
		 Double holdTempBalance;//Holds account ballance of current ammount.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains(Username)) {
				numOfaccounts = i;
				System.out.println(i+": "+accountList.get(i).getAccountType()+": "+accountList.get(i).getAccountBalance());
			}
		}
		int fromAcct = scanner.nextInt();
		if (fromAcct <= numOfaccounts) {
			
			System.out.println("Which account would you like to transfer to?");
			for (int j = 0; j < accountList.size(); j++) {
				
				System.out.println(j+": "+accountList.get(j).getAccountType());
			}
			int toAcct = scanner.nextInt();
			double dollarAmt = 0.0;
			if (toAcct <= numOfaccounts) {
				System.out.println("How much would like to transfer?");
				dollarAmt = scanner.nextDouble();
			}
			for (int j = 0; j < accountList.size(); j++) {
				if (dollarAmt <= accountList.get(j).getAccountBalance()) {
					accountList.get(toAcct).setAccountBalance(accountList.get(toAcct).getAccountBalance()+dollarAmt);//adds funds to account
					accountList.get(fromAcct).setAccountBalance(accountList.get(fromAcct).getAccountBalance()-dollarAmt);//Remove funds from account.
					System.out.println("Funds successfuly transfered!");
					writeAccountFile();
					ProgramStart.customerMenu(Username);

				}
			}
		}
	}
	//Add funds to account
	public static void deposit(String username) {
		Scanner scanner = new Scanner(System.in);
		readAccountFile();
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
		System.out.println("Select account to deposit to.");
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains(username)) {
				listAcct.add(accountList.get(i).getAccountBalance());
				System.out.println(i+": "+accountList.get(i).getAccountType()+": "+accountList.get(i).getAccountBalance());
			}
		}
		
			int selectedAcct = scanner.nextInt();
			System.out.println("how much would you like to deposit?");
			dollarAmt = scanner.nextDouble();
			for (int j = 0; j < accountList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(dollarAmt >= 0.0) {
								accountList.get(selectedAcct).setAccountBalance(accountList.get(selectedAcct).getAccountBalance()+dollarAmt);
								System.out.println("Deposit successful!");
							}else {
								System.out.println("Something went wrong please try again.");
								deposit(username);
							}
						}
					}
			}
			writeAccountFile();
	}
	//Make a withdraw
	public static void withdraw(String username) {
		Scanner scanner = new Scanner(System.in);
		readAccountFile();
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
		System.out.println("Select account to deposit to.");
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains(username)) {
				listAcct.add(accountList.get(i).getAccountBalance());
				System.out.println(i+": "+accountList.get(i).getAccountType()+": "+accountList.get(i).getAccountBalance());
			}
		}
		
			int selectedAcct = scanner.nextInt();
			System.out.println("how much would you like to withdraw?");
			dollarAmt = scanner.nextDouble();
			for (int j = 0; j < accountList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(accountList.get(j).getAccountBalance() >= dollarAmt) {
								accountList.get(selectedAcct).setAccountBalance(accountList.get(selectedAcct).getAccountBalance()-dollarAmt);
								System.out.println("Withdraw successful!");
							}else {
								System.out.println("Something went wrong please try again.");
								withdraw(username);
							}
						}
					}
			}
			writeAccountFile();
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
