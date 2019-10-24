package com.revature.control;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.revature.control.LoginControl;
import com.revature.model.Account;
import com.revature.model.Employee;

public class SessionControl {

	LoginControl lic = new LoginControl();
	private Account account;
	private Account transferToAccount;
	private Employee employee;
	private List<Account> allAccounts;
	private List<Employee> allEmployees;
	private boolean isLoggedIn = false;
	private boolean isEmployeeLoggedin = false;
	private Map<String, Object> accountsMap = lic.getUsers();

	//constructor called for accounts
	public SessionControl(Account account, List<Account> allAccounts) {
		this.account = account;
		this.allAccounts = allAccounts;
		isLoggedIn = true;
	}

	//constructor for employees
	public SessionControl(Employee employee, List<Employee> allEmployees, List<Account> allAccounts) {
		this.employee = employee;
		this.allEmployees = allEmployees;
		this.allAccounts = allAccounts;
		isEmployeeLoggedin = true;
	}

	// display menu for account options once logged in
	public void displayOptions() {
		System.out.println();
		System.out.println("1) Balance \t 2) Transfer \t 3) Withdraw \t 4) Deposit \t 5) Approval \t 6) Quit");
		System.out.println("Enter a number for each option:");
	}
	//get input for accounts once logged in
	public void getMenuInput() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		Double amount;
		switch (input) {
		case 1:
			System.out.println("You have " + String.format("%.2f", account.getBalance()));
			break;
		case 2:
			System.out.println("Enter amount to transfer: ");
			amount = scan.nextDouble();
			System.out.println("Who would you like to receive this money?");
			String receiver = scan.next();
			transferToAccount = getAccountFromUsername(receiver);
			account.transfer(transferToAccount, account, amount);
			break;
		case 3:
			System.out.println("How much would you like to withdraw?");
			amount = scan.nextDouble();
			account.withdrawMoney(amount);
			break;
		case 4:
			System.out.println("How much would you like to deposit?");
			amount = scan.nextDouble();
			account.depositMoney(amount);
			break;
		case 5:
			if (account.isApproved())
				System.out.println("You have been approved");
			else
				System.out.println("Your application is still being reviewed.");
			break;
		case 6:
			isLoggedIn = false;
			break;
		default:
			System.out.println("I don't know that command.");
		}
	}

	// employees display menu
	public void displayEmployeeOptions() {
		System.out.println();
		System.out.println("1) Show Accounts\t 2) Print Account \t 3) Transfer \t 4) Approve Accounts \t 5) Quit ");
		System.out.println("Enter a number for each option:");
	}
	// menu input for employee accounts
	// implement employee methods
	public void getEmployeeMenuInput() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		switch (input) {
		case 1:
			System.out.println("Show all accounts ");
			showAccountsForEmployees();
			break;
		case 2:
			getSingleAccount();
			break;
		case 3:
			System.out.println("transfer funds");
			break;
		case 4:
			System.out.println("Approve accounts");
			break;
		case 5:
			System.out.println("see you soon");
			isLoggedIn = false;
			break;
		default:
			System.out.println("I don't know that command.");
		}
	}
	//display all accounts to employees
	public void showAccountsForEmployees() {
		for(Account a: allAccounts) {
		 System.out.println(a.toString());
		}
	}
	public void transferBetweenAccounts() {
		
	}
	public void approveAccounts() {
		System.out.println("\n Enter an account username:  ");
		Scanner scan = new Scanner(System.in);
	}
	//used to return a single account for a logged in employee
	public void getSingleAccount() {
		System.out.println("\n Enter an account to print :  ");
		Scanner scan = new Scanner(System.in);
		
		String uname = scan.next();
		for(Account a: allAccounts) {
		
		if(uname.equals(a.getUsername())) {
			System.out.println(a.getUsername() + " has a balance of: " + a.getBalance());
			break;
		} else {
			System.out.println("Account usernmae not found");
		}
		}
	}
	
	//called when an account wants to transfer money to another account
	//to find the account by the username
	private Account getAccountFromUsername(String name) {
		for (Account a : allAccounts) {
			if (a.getUsername().equals(name))
				return a;
		}
		return null;
	}
	public boolean getIsLoggedIn() {
		return isLoggedIn;
	}
	public boolean getisEmployeeLoggedin() {
		return isEmployeeLoggedin;
	}
}
