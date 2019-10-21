package com.revature.people;

import java.util.Random;

import com.revature.account.Account;
import com.revature.bankapplication.ScannerMain;

public class Administrator extends Employee {
	public Administrator(String first, String last, String password, int socialsecnum) {
		super(first, last, password, socialsecnum);
		this.admin_auth = true;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fill_options() {
		options.put(1, "View bank information");
		options.put(2, "View account owner's personal information");
		options.put(3, "Logout");
		options.put(4, "Withdraw from account");
		options.put(5, "Deposit from account");
		options.put(6, "Transfer to this account (from main bank).");
		options.put(7, "Transfer from this account(to main bank).");
		options.put(8, "Delete this account and customer.");
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
			Employee.main_bank.withdrawal(transferred);
		}
		else if(n == 5) {
			double transferred = ScannerMain.enter_amount();
			Employee.main_bank.deposit(transferred);
		}
		else if(n == 6) {
			double transferred = ScannerMain.enter_amount();
			System.out.println("Who do you want to transfer to?");
			int other_place = ScannerMain.find_customer(ScannerMain.clients);
			Employee.main_bank.transferTo(transferred, ScannerMain.clients.get(other_place).your_account);
		}
		else if(n == 7) {
			double transferred = ScannerMain.enter_amount();
			System.out.println("Who do you want to transfer from?");
			int other_place = ScannerMain.find_customer(ScannerMain.clients);
			Employee.main_bank.transferFrom(transferred, ScannerMain.clients.get(other_place).your_account);
		}
		else if(n == 8) {
			System.out.println("Who do you want to transfer to?");
			int other_place = ScannerMain.find_customer(ScannerMain.clients);
			for(Account goes_bye : ScannerMain.accounts) {
				if(goes_bye.getOwner() == ScannerMain.clients.get(place).getFullName()) {
					ScannerMain.accounts.remove(place);
				}
			}
		}
		else {
			System.out.println("That is not an appropriate option.");
		}
	}
}
