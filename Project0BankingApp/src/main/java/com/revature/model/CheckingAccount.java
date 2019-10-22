package com.revature.model;

import java.util.Random;

import com.revature.model.Account;
import com.revature.model.Transfer;

public class CheckingAccount extends Account implements Transfer {


	public CheckingAccount(String username, String password, boolean approved, Double balance) {
		this.username = username;
		this.password = password;
		this.approved = false;
		this.balance = balance;
		Random rand = new Random();
		this.accountNumber = rand.nextInt(32000);
	}

	@Override
	public void transfer(Account AccountTo, Account accountFrom, double transferAmount) {
		
		double moneySender = accountFrom.getBalance();
		double moneyReceiver = accountFrom.getBalance();
		
		//the amount to subtract from the sender
		double moneyToGet = transferAmount;
		
		//the final amount in the receiver's account 
		double moneyToGive = moneyReceiver;
		
		if(moneyToGet > moneySender){
			System.out.println("Invalid funds for this transaction");
			System.out.println("Trying to take " + moneyToGet + " from an amount of " + moneySender);
			
		// the transfer will succeed
		}else{
			
			//give the money to the receiver
			moneyToGive += transferAmount;
			AccountTo.setBalance(moneyToGive);
			
			//take the money from the sender
			accountFrom.setBalance((moneySender - moneyToGive));
			System.out.println("Transferred " + transferAmount + " to " + AccountTo.getUsername());
		}
	}

	@Override
	public String toString() {
		return "c " + username + " " + password
				+ " " + approved + " " + balance + "";
	}
	
	

}

