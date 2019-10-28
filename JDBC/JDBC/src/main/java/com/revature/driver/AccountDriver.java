package com.revature.driver;

import java.sql.SQLException;

import com.revature.accountsdaoimpl.AccountsDaoImpl;
import com.revature.beans.Accounts;

public class AccountDriver {
	
	
//	public static void main(String[] args) {
//		AccountsDaoImpl adi = new AccountsDaoImpl();
//
//		try {
//
//		adi.insertaccounts("bean", 2217, 6000.00, "checking");
//
//	} catch (SQLException e) {
//
//		e.printStackTrace();
//	}
//}
//

	
	
	
	
	public double checkbalance(Accounts a) {
		return a.getAccounts_accountbalance(); 
	}
	
	public boolean withdrawfromaccounts(Accounts a, double amount){
		if (a.getAccounts_accountbalance() > amount) {
			a.setAccounts_accountbalance(a.getAccounts_accountbalance()-amount);
			return true;
			}
			
			return false;
		}
	
	public void deposittoaccounts(Accounts a, double amount ) {
		a.setAccounts_accountbalance(a.getAccounts_accountbalance()+amount);
		
	}
	public boolean tranferfunds(Accounts fromaccount, Accounts toaccount, double amount) {
		AccountDriver dostuff= new AccountDriver();
		if (dostuff.withdrawfromaccounts(fromaccount, amount)) {
			dostuff.deposittoaccounts(toaccount, amount);
			return true;
		}
		
		   return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	