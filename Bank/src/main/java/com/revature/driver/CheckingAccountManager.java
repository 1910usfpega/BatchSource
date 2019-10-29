package com.revature.driver;

import com.revature.beans.Account;;

public class CheckingAccountManager {
	
	//CheckingAccountManager cman=new CheckingAccountManager();
	

	public static boolean withdrawal(Account account, double amount) { 
		if(amount <= account.getCheckBalance()) {
			account.setCheckBalance( account.getCheckBalance() - amount) ;
			System.out.println("Withdrawal of $"+ amount + " accepted. New balance = $"+ account.getCheckBalance());
		return true;
		}
		else {
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
		return false;	
			
		}
		}
	
	public static boolean deposit(Account account, double amount) {
		if(amount > 0) {
			account.setCheckBalance(account.getCheckBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New balance = $" + account.getCheckBalance() + ".");
			return true;
		}
			else {
				System.out.println("Error. Invalid ammount! Transaction voided.");				
				return false;
			}
	}
}
