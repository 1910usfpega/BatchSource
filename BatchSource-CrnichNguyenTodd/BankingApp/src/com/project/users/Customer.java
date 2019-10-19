package com.project.users;


public class Customer extends Person{

public Customer(String name, String last) {
	this.name = name;
	this.last = last;
	this.addBankAccount();
	list.add(this);
}
public void viewAccount() {
	bankAccount [] b =this.allAccounts(this);
	for(bankAccount x: b)
		System.out.print(x.getAccountNumber());
	}

	public double viewAccount(bankAccount account) { // check cash amount
		if(bAccount.contains(account))
			return account.getBalance();
		return -1;
	}
	

	public boolean transfer(double amount ,bankAccount takeAccount, bankAccount giveAccount) { 
		if(bAccount.contains(takeAccount)) {
			if(bAccount.contains(giveAccount)) {
				if(checkMoney(takeAccount, amount)) {
				takeAccount.withdraw(amount, takeAccount);
				giveAccount.deposit(amount);
				return true;
				}
			}
		}	
		return false;
	}
	
	public boolean jointAccount(Customer a, Customer b,bankAccount c) { //apply for
		if(cInfo.containsKey(a)) {
			if(cInfo.containsKey(b)) {
				if(bAccount.contains(bAccount)) {
					b.addBankAccount(c);
					return true;
				}
			}
		}
		return false;
	}
	
	public bankAccount [] allAccounts(Customer a) { // returns all account that the user has 
			
		bankAccount[] Array = new bankAccount[a.bAccount.size()];
		if(!a.bAccount.isEmpty()) {
			int i = 0;
			for(bankAccount x :this.bAccount ) {
				Array[i] = x;
				i++;
			}
		}
		return Array;
		
	}
	
}
