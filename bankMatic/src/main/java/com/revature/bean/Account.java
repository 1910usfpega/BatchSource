package com.revature.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import com.revature.io.AccountsIO;

public class Account implements Serializable {
	/**
	 * 
	 */
	public static Scanner sc = new Scanner(System.in);

	private static final long serialVersionUID = -6442998822103581490L;

	private String accountName;
	private Double balance;
	private String ownerUsername;
	private String accountStatus;
	private Integer accountNumber;

	public Account(String accountName, Double balance, String ownerUsername, String accountStatus,
			Integer accountNumber) {
		super();
		this.accountName = accountName;
		this.balance = balance;
		this.ownerUsername = ownerUsername;
		this.accountStatus = accountStatus;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", balance=" + balance + ", ownerUsername=" + ownerUsername
				+ ", accountStatus=" + accountStatus + ", accountNumber=" + accountNumber + "]";
	}

	public static Account getAccount(Integer accountNum, List<Account> accountList) {
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).accountNumber.equals(accountNum)) {
				return accountList.get(i);
			}
		}
		return null;

	}

	public static void workWithAccountMenuLoop (Account currentAccount, Customer currentCustomer) {
		Boolean flag1 = true;
		while (flag1) {
			System.out.format("\n\n==================\n"
					+ "Account: %s\n"
					+ "Account number: %s\n"
					+ "Balance: %s\n", 
					currentAccount.getAccountName(), 
					currentAccount.getAccountNumber(),
					currentAccount.getAccountStatus(),
					currentAccount.getBalance()
					);
			
			
			if (currentAccount.getAccountStatus().equals("active")) {
				// TODO Work with active account
				System.out.println("What whoud you like to do?");
				System.out.println("1.Deposit");
				if (sc.hasNextInt()) {
					Integer contentsFromUser = sc.nextInt();
					if (contentsFromUser.equals(1) ) {
						System.out.println("How much would you like to deposit?");
						Double  m;
						m = sc.nextDouble();
						
						
						currentAccount.deposit(m);
						AccountsIO aIO = AccountsIO.getInstance();
						aIO.writeToFile();
						
					}
				
				}
				
			} else if (currentAccount.getAccountStatus().equals("pending")) {
				System.out.println("What whoud you like to do?");
				System.out.println("1. Cancel Application");
				System.out.println("2. Back to My Account");
				System.out.println("Input action number");
				
				if (sc.hasNextInt()) {
					Integer contentsFromUser = sc.nextInt();
					if (contentsFromUser.equals(1) ) {
						currentAccount.setAccountStatus("canceled");
						AccountsIO.getInstance().writeToFile();
					} else if (contentsFromUser.equals(2)) {
						flag1 = false;
					}
				}
			} else if (currentAccount.getAccountStatus().equals("canceled")) {
				System.out.println("\nThis account was canceled. You cant work with it. Call us!");
			}
			
			
			flag1 = false;
		}
	}
	
	public void withdraw(double money) {
		this.balance = this.balance - money;	
	}
	
	public void deposit(double money) {
		this.balance = this.balance + money;
	}

	public void transfer(Account a, double money) {
		this.withdraw(money);
		a.deposit(money);
		
	}
	
}
