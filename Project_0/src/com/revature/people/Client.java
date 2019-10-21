package com.revature.people;

import java.util.Random;

import com.revature.account.Account;
import com.revature.bankapplication.ScannerMain;

public class Client extends Person{
	private double amount;
	private String employee;
	private int credit;
	Account your_account;
	
	public Client(String first, String last, String password, int socialsecnum, String employee, double i_amount, int credit) {
		super(first, last, password, socialsecnum);
		// TODO Auto-generated constructor stu
		this.amount = i_amount;
		this.employee = employee;
		this.credit = credit;
		your_account = new Account((first + last), i_amount);
		
		ScannerMain.clients.add(this);
	}

	@Override
	public String toString() {
		return "Client [amount=" + amount + ", employee=" + employee + ", credit=" + credit + ", your_account="
				+ your_account + "]";
	}

	@Override
	public void fill_options() {
		options.put(1, "View bank information");
		options.put(2, "View account owner's personal information");
		options.put(3, "Logout");
		options.put(4, "Withdraw from account.");
		options.put(5, "Deposit to account.");
		options.put(6, "Transfer to another account");
		options.put(7, "Deposit from another account");
	}
	
	@Override
	public void select_option(int n, int place) {
		if (n == 1) {
				ScannerMain.clients.get(place).your_account.toString();
		}
		else if(n == 2) {
				ScannerMain.clients.get(place).toString();
		}
		else if(n == 3) {
				// Ask Roman about if he has a function for logging out
				logout();
		}
		else if(n == 4) {
			double transferred = ScannerMain.enter_amount();
			ScannerMain.clients.get(place).your_account.withdrawal(transferred);
		}
		else if(n == 5) {
			double transferred = ScannerMain.enter_amount();
			ScannerMain.clients.get(place).your_account.deposit(transferred);
		}
		else if(n == 6) {
			double transferred = ScannerMain.enter_amount();
			System.out.println("Who do you want to transfer to?");
			int other_place = ScannerMain.find_customer(ScannerMain.clients);
			ScannerMain.clients.get(place).your_account.transferTo(transferred, ScannerMain.clients.get(other_place).your_account);
		}
		else if(n == 7) {
			double transferred = ScannerMain.enter_amount();
			System.out.println("Who do you want to transfer from?");
			int other_place = ScannerMain.find_customer(ScannerMain.clients);
			ScannerMain.clients.get(place).your_account.transferFrom(transferred, ScannerMain.clients.get(other_place).your_account);
		}
		else {
			System.out.println("That is not an appropriate option.");
		}
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Account getYour_account() {
		return your_account;
	}

	public void setYour_account(Account your_account) {
		this.your_account = your_account;
	}

	public String getFirst() {
		return first;
	}
	
	public void setFirst(String name) {
		first = name;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setLast(String name) {
		last = name;
	}
	
	public String getFullName() {
		return first + last;
	}

	public int getSsn() {
		// TODO Auto-generated method stub
		return 0;
	}
}