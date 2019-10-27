package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.model.Account;
import com.revature.model.User;

public class Input extends UserDaoImpl {
	
	public Input() {
		super();
	}
	
	Scanner scan = new Scanner(System.in);
	
	User user = new User();
	
	public void createUserAccount() throws SQLException {
		String username;
		String password;
		String firstName;
		String lastName;
		
		System.out.println("Enter a userame you want to use: ");
		username = scan.nextLine();
		user.setUsername(username);
		
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
	
	public void login() throws SQLException {
		System.out.println("Enter a userame you want to use: ");
		String username = scan.nextLine();
		while(!doesUsernameMatch(username)) {
			System.out.println("not found, try again: ");
			username = scan.nextLine();
		}
		System.out.println("Enter your password: ");
		String password = scan.nextLine();
		while(!doesPasswordMatch(password, username)) {
			System.out.println("No match, try again: ");
			password = scan.nextLine();
		}
		AccountMenu acctMenu = new AccountMenu();
		acctMenu.accountMenuOtions(username);
		
	}
	
	public void createNewBankAccount() throws SQLException {
		System.out.println("Select an amount to deposit:");
		double balance = scan.nextDouble();
		System.out.println("enter the type of account \"checking\" or \"savings\": ");
		String type = scan.nextLine();
		
		
		//check why username not getting to the account id filed sql?
		Account account= new Account();
		account.setId(user.getUsername());
		account.setBalance(balance);
		account.setType(type);
		
		AccountDaoImpl acdi = new AccountDaoImpl();
		acdi.createAccount(account);
		
		AccountMenu acctMenu = new AccountMenu();
		acctMenu.accountMenuOtions(user.getUsername());
		
	}

}
