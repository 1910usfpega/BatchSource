package com.jdbc.bank.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.daoimple.AccountDoaImple;
import com.jdbc.bank.daoimple.UserDoaImple;

public class MenuInput extends UserDoaImple {
	public MenuInput() {
		super();
	}

	Scanner scan = new Scanner(System.in);
	//User instance 
	User user = new User();



	public void login() throws SQLException {

		System.out.println("What is your username: ");
		String uName = scan.nextLine();
		
		//accesses the UserDaoImple doesUsernameMatch() method which is
		//passed as a string to check if the passed string matches the value
		//in the username column from the users table if a match is found
		//the password will go through basically the same process.

		
		while (!passwordMatch(uName)) {
			System.out.println("The Username could not be found, try again: ");
			uName = scan.nextLine();
		}
		
		System.out.println("What is your password: ");
		String password = scan.nextLine();
		
		while (!doesPassMatch(password, uName)) {
			System.out.println("Your password does not match, please try again: ");
			password = scan.nextLine();
		}
	
		AccountInput acctOptions = new AccountInput();
		acctOptions.accountMenuOptions(uName);

	}
	
	public void createUserAccount() throws SQLException {	
		String uName;
		String password;
		String firstName;
		String lastName;
			
		System.out.println("Create a username you wish to be identified here at Redeemings: ");
		uName = scan.nextLine();
		
		while (passwordMatch(uName)) {
			System.out.println("This Username is already taken, try again by typing into the console: ");
			uName = scan.nextLine();
		}
		user.setuName(uName);
		
		System.out.println("Enter your secure password: ");
		password = scan.nextLine();
		user.setPassword(password);
		
		System.out.println("What is your first name: ");
		firstName = scan.nextLine();
		user.setFirstName(firstName);
		
		System.out.println("What is your last name: ");
		lastName = scan.nextLine();
		user.setLastName(lastName);
		
		System.out.println(user);
		createUser(user);
	}
	
	

	//creates a new account when users log in or register
	public void createNewBankAccount() throws SQLException {
		String uName;
		double balance;
		String type;

		System.out.println("What username will be accessing this account?: ");
		uName = scan.nextLine();

		System.out.println("What type of account are you signing up for?  \"checking\" or \"savings\": ");
		type = scan.nextLine();

		System.out.println("How much would you like to deposit with us today?: ");
		balance = scan.nextDouble();

		Account account = new Account();

		//updating uname, balance, type to the data base 
		account.setAcct_uname(uName);
		account.setBalance(balance);
		account.setAccType(type);

		AccountDoaImple acctDaoImpl = new AccountDoaImple();
		acctDaoImpl.createAccount(account);

		//showing menu options for the account, uname passed to the account
		AccountInput acctMenuInput = new AccountInput();
			acctMenuInput.accountMenuOptions(uName);
		
	}
}
