package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.model.Account;
import com.revature.model.User;

//we use this class to manage user input and to:
//1. create user accounts
//2. manage login for users
//3. create a bank account for users.


//we extend the UserDaoImpl class to have access
//to its public methods w/o instantiating a UserDaoImpl object
public class Input extends UserDaoImpl {

	//no-args constructor
	public Input() {
		super();
	}

	Scanner scan = new Scanner(System.in);

	//User instance 
	User user = new User();

	//create a user account that gets passed to the UserDaoImpl createUser() method
	//that accepts a User as a param
	public void createUserAccount() throws SQLException {
		String username;
		String password;
		String firstName;
		String lastName;

		System.out.println("Enter a userame you want to use: ");
		
		username = scan.nextLine();
		
		while (doesUsernameMatch(username)) {
			System.out.println("username already in use, try again: ");
			username = scan.nextLine();
		}
		user.setUsername(username);
		
		//Used to implement secure password on java side
		//look at this: 
		//https://stackoverflow.com/questions/40659911/password-verification-program-java
		//Password must be at least 8 characters long and composed of numbers and letters.
		System.out.println("Enter your secret password: ");
		password = scan.nextLine();
		user.setPassword(password);
		
		System.out.println("Enter your first name: ");
		firstName = scan.nextLine();
		user.setFirstName(firstName);
		System.out.println("Enter your last name: ");
		lastName = scan.nextLine();
		user.setLastName(lastName);

		createUser(user);
	}

	//handles user login, no parameters because we use the scanner for input
	public void userLogin() throws SQLException {

		System.out.println("Enter your username: ");
		String username = scan.nextLine();
		
		//we access the UserDaoImpl doesUsernameMatch() method which is
		//passed a string to check if the passed string matches a value
		//in the username column from the users table if a match is found, we move on to password
		while (!doesUsernameMatch(username)) {
			System.out.println("Username not found, try again: ");
			username = scan.nextLine();
		}
		
		System.out.println("Enter your password: ");
		String password = scan.nextLine();
		
		//now we access the doesPasswordMatch() method from UserDaoImpl class
		//to check if the passed password matches the password for the row that contains the username.
		while (!doesPasswordMatch(password, username)) {
			System.out.println("Password does not match, try again: ");
			password = scan.nextLine();
		}
		//upon successful login, create and instantiate a new 
		//AccountMenu object and access the accountsMenuOptions() method 
		//that handles input after login.
		AccountMenu acctMenu = new AccountMenu();
		acctMenu.accountMenuOtions(username);

	}

	//creates a new account after the user logs in or registers
	public void createNewBankAccount() throws SQLException {
		String username;
		double balance;
		String type;

		System.out.println("Enter your username: ");
		username = scan.nextLine();

		System.out.println("enter the type of account \"checking\" or \"savings\": ");
		type = scan.nextLine();

		System.out.println("Select an amount to deposit: ");
		balance = scan.nextDouble();

		//no-args constructor bc we don't have access to the acct# sequence yet
		//defaulted to 0 then when the createAccount() method from the AccountDaoImpl class
		//is called the account number is assigned.
		Account account = new Account();

		//set the values that we care about to send to db 
		account.setId(username);
		account.setBalance(balance);
		account.setType(type);

		AccountDaoImpl acdi = new AccountDaoImpl();
		acdi.createAccount(account);

		//show the account menu options with the username passed to the account
		//efficiency?
		AccountMenu acctMenu = new AccountMenu();
		acctMenu.accountMenuOtions(username);

	}

}
