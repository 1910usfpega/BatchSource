package com.revature.model;


import java.util.Random;

public class SavingAccount extends Account implements Transfer {

	public SavingAccount(String username, String password, boolean approved, Double balance) {
		this.username = username;
		this.password = password;
		this.approved = false;
		this.balance = balance;		
		Random rand = new Random();
		this.accountNumber = rand.nextInt(32000);
	}
	@Override
	public void transfer(Account accounTo, Account accountFrom, double transferAmount) {
		
		double cashSender = accountFrom.getBalance();
		double cashReceiver = accountFrom.getBalance();
		
		//the amount to subtract from the sender
		double cashToTake = transferAmount;
		cashToTake += cashToTake;
		
		//the final amount in the receiver's account 
		double cashToGive = cashReceiver;
		
		if(cashToTake > cashSender){
			System.out.println("Invalid funds for this transaction");
			
		// the transfer will succeed
		}else{
			
			//give the money to the receiver
			cashToGive += transferAmount;
			accounTo.setBalance(cashToGive);
			
			//take the money from the sender
			accountFrom.setBalance((cashSender - cashToTake));
			System.out.println("Transferred " + transferAmount + " to " + accounTo.getUsername());
		}
	}
	
	@Override
	public String toString() {
		return "s " + username + " " + password
				+ " " + approved + " " + balance + "";
	}
	
}

