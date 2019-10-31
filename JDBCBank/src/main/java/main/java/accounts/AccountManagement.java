package main.java.accounts;

import static org.hamcrest.CoreMatchers.containsString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.management.loading.PrivateClassLoader;
import javax.security.auth.login.AccountLockedException;

import main.java.bean.User;
import main.java.dao.AccountDao;
import main.java.implementations.AccountDaoImpl;
import main.java.programstart.ProgramStart;

public class AccountManagement {
	//Create a checking account for a single person
	public static void CreateSinglePersonCheckingAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
//		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		AccountDaoImpl dao = new AccountDaoImpl();
		try {
			double bal = scanner.nextDouble();
			dao.addAccount("Checking", username, bal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account created.");
		ProgramStart.customerMenu(username);
	}
	//Create a Joint checking account between two people
	public static void CreateJointCheckingAccount(String usernameA, String usernameB) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
//		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		AccountDaoImpl dao = new AccountDaoImpl();
		try {
			double bal = scanner.nextDouble();
			dao.addAccount("Joint Checking", usernameA+"/"+usernameB, bal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA );

	}
	//Create a one person savings account.
	public static void CreateSinglePersonSavingsAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
//		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		AccountDaoImpl dao = new AccountDaoImpl();
		try {
			double bal = scanner.nextDouble();
			dao.addAccount("Savings", username, bal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account created.");
		ProgramStart.customerMenu(username);
	}
	//Create a joint savings account between two people.
	public static void CreateJointSavingsAccount(String usernameA, String usernameB) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
//		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		AccountDaoImpl dao = new AccountDaoImpl();
		try {
			double bal = scanner.nextDouble();
			dao.addAccount("Joint Savings", usernameA+"/"+usernameB, bal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
}
	//Transfer funds between accounts
	public static void transferFunds(String Username) {
		Scanner scanner = new Scanner(System.in);
		AccountDaoImpl dao = new AccountDaoImpl();
			try {
				List<Account> accountsList = dao.getAllAccounts();
				System.out.println("Select account to transfer from!");
				int numOfaccounts = 0;
				 Double holdTempBalance;//Holds account ballance of current ammount.
				for (Account account : accountsList) {
					if(account.getUsername().equals(Username)) {
						System.out.println(numOfaccounts+": "+account.getAccountType()+": "+account.getAccountBalance());
						numOfaccounts +=1;
					}
				}
				int fromAcct = scanner.nextInt();	
				if (fromAcct <= numOfaccounts) {
					System.out.println("Which account would you like to transfer to?");
					int counter = 0;
					for (Account account : accountsList) {
						System.out.println(counter+": "+account.getAccountType());
						counter+=1;
					}
				}
					int toAcct = scanner.nextInt();
					double dollarAmt = 0.0;
					if (toAcct <= numOfaccounts) {
						System.out.println("How much would like to transfer?");
						dollarAmt = scanner.nextDouble();
					}
					
					for (int j = 0; j < accountsList.size(); j++) {
						if (dollarAmt <= accountsList.get(j).getAccountBalance()) {
							dao.updateBalance(accountsList.get(toAcct).getAccountType(), Username, accountsList.get(toAcct).getAccountBalance()+dollarAmt);
							dao.updateBalance(accountsList.get(fromAcct).getAccountType(), Username, accountsList.get(fromAcct).getAccountBalance()-dollarAmt);
							System.out.println("Funds successfuly transfered!");
							ProgramStart.customerMenu(Username);

						}
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	//Add funds to account
	public static void deposit(String username) {
		double remainingBal = 0.0;
		AccountDaoImpl dao = new AccountDaoImpl();
	try {
		List<Account> accountsList = dao.getAllAccounts();
		Scanner scanner = new Scanner(System.in);
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
		int counter = 0;
		System.out.println("Select account to deposit to.");
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		for (int i = 0; i < accountsList.size(); i++) {
			if (accountsList.get(i).getUsername().equals(username)) {
				listAcct.add(accountsList.get(i).getAccountBalance());
				System.out.println(counter+": "+accountsList.get(i).getAccountType()+": "+accountsList.get(i).getAccountBalance());
				counter+=1;
			}
		}
			String aType = "";
			int selectedAcct = scanner.nextInt();
			System.out.println("how much would you like to deposit?");
			dollarAmt = scanner.nextDouble();
			for (int j = 0; j < accountsList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountsList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(dollarAmt >= 0.0) {
								aType = accountsList.get(selectedAcct).getAccountType();
								remainingBal = accountsList.get(selectedAcct).getAccountBalance()+dollarAmt;
								System.out.println("Deposit successful!");
							}else {
								System.out.println("Something went wrong please try again.");
								deposit(username);
							}
						}
					}
						dao.updateBalance(aType, username, remainingBal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			remainingBal = 0.0;
	}
	//Make a withdraw
	public static void withdraw(String username) {
		double remainingBal = 0.0;
		Scanner scanner = new Scanner(System.in);
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
	try {
		AccountDaoImpl dao = new AccountDaoImpl();
		List<Account> accountList = dao.getAllAccounts();
		System.out.println("Select account to deposit to.");
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		int counter = 0;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().equals(username)) {
				listAcct.add(accountList.get(i).getAccountBalance());
				System.out.println(counter+": "+accountList.get(i).getAccountType()+": "+accountList.get(i).getAccountBalance());
				counter+=1;
			}
		}
		
			int selectedAcct = scanner.nextInt();
			System.out.println("how much would you like to withdraw?");
			dollarAmt = scanner.nextDouble();
			String aType = "";
			for (int j = 0; j < accountList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(accountList.get(j).getAccountBalance() >= dollarAmt) {
								aType = accountList.get(selectedAcct).getAccountType();
								remainingBal = accountList.get(selectedAcct).getAccountBalance()-dollarAmt;
								System.out.println("Withdraw successful!");
							}else {
								System.out.println("Something went wrong please try again.");
								withdraw(username);
							}
						}
					}
				dao.updateBalance(aType, username, remainingBal);
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			remainingBal = 0.0;	
		}
	public static void getAccountsByName(String username) {
	try {
		AccountDaoImpl dao = new AccountDaoImpl();
		List<Account> accountList = dao.getAllAccounts();
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println("********************************************************************************************************************");
			System.out.println(accountList.get(i).toString());
			System.out.println("********************************************************************************************************************");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
