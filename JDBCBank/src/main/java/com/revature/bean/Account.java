package com.revature.bean;

import java.util.Date;
import java.util.List;

import com.revature.driver.Driver;

public class Account extends Driver {

	//Account Info
	protected static int userId;
	protected static String userType;
	protected static String username;
	protected static String password;
	protected static String firstName;
	protected static String lastName;
	protected static String accountType;
	protected static int accountId;
	protected static double accountBalance;
	
	//Transaction History
	protected static double amount;
	protected static String transactionType;
	protected static int transactionId;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Account Info
	public Account (int userId, String userType, String firstName, String lastName, 
			String accountType, int accountId, double accountBalance) {
		super();
		Account.userId = userId;
		Account.userType = userType;
		Account.firstName = firstName;
		Account.lastName = lastName;
		Account.accountType = accountType;
		Account.accountId = accountId;
		Account.accountBalance = accountBalance;
		
	}
	
	public Account (double accountBalance) {
		Account.accountBalance = accountBalance;
	}
	
	//Account Info
	public Account (int userId, String userType, String username, String password, String firstName, String lastName, 
			String accountType, int accountId, double accountBalance, double amount, String transactionType, int transactionId) {
		super();
		Account.userId = userId;
		Account.userType = userType;
		Account.username = username;
		Account.password = password;
		Account.firstName = firstName;
		Account.lastName = lastName;
		Account.accountType = accountType;
		Account.accountId = accountId;
		Account.accountBalance = accountBalance;
	}
		
	
	
	//Transactions
	public Account (int userId, int accountId, String accountType, double amount, double accountBalance, 
			String transactionType, int transactionId) {
		Account.userId = userId;
		Account.accountId = accountId;
		Account.accountType = accountType;
		Account.amount = amount;
		Account.accountBalance = accountBalance;
		Account.transactionType = transactionType;
		Account.transactionId = transactionId;
		
	}

	public Account (int userId, int accountId, String accountType, double accountBalance) {
		Account.userId = userId;
		Account.accountId = accountId;
		Account.accountType = accountType;
		Account.accountBalance = accountBalance;
	}
	
	//

	
	
	//fix toString 

//	public Account(List<Account> accountId) {
//		Account.accountId = accountId;
//	}
//	
	public Account(int accountId) {
		Account.accountId = accountId;
	}

	public static int getUserId() {
		return userId;
	}

	public static void setUserId(int userId) {
		Account.userId = userId;
	}

	public static String getUserType() {
		return userType;
	}

	public static void setUserType(String userType) {
		Account.userType = userType;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Account.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Account.password = password;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Account.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Account.lastName = lastName;
	}

	public static String getAccountType() {
		return accountType;
	}

	public static void setAccountType(String accountType) {
		Account.accountType = accountType;
	}

	public static int getAccountId() {
		return accountId;
	}

	public static void setAccountId(int accountId) {
		Account.accountId = accountId;
	}

	public static double getAccountBalance() {
		return accountBalance;
	}

	public static void setAccountBalance(double accountBalance) {
		Account.accountBalance = accountBalance;
	}

	public static double getAmount() {
		return amount;
	}

	public static void setAmount(double amount) {
		Account.amount = amount;
	}

	public static String getTransactionType() {
		return transactionType;
	}

	public static void setTransactionType(String transactionType) {
		Account.transactionType = transactionType;
	}

	public static int getTransactionId() {
		return transactionId;
	}

	public static void setTransactionId(int transactionId) {
		Account.transactionId = transactionId;
	}
	
	
	
	@Override
	public String toString() {
		return "\nUser ID : " + userId + "\nUser Type : " + userType + "\nName : " + firstName + " " + lastName
				+ "\nAccount Type : " + accountType + "\nAccount ID : " + accountId + "\nAccount Balance : $" + 
				accountBalance
				;
	}
	
	
	
}
