package com.revature.loops;

import java.util.List;
import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.beans.Customer;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.util.AccountInfo;
import com.revature.util.GlobalStorageSingletone;

public class EmployeeApprovalLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		System.out.println("\n\n"
				+ "==========================\n"
				+ "Account approval interface\n"
				+ "==========================");
		AccountDaoImpl adi = new AccountDaoImpl();
		List<AccountInfo> accountInfoList= adi.getAllAccountsWithStatus("pending");
		boolean exitFlag = true;
		
		while (accountInfoList.size()>0 && exitFlag) {
			BankAccount account = accountInfoList.get(0).getBankAccount();
			Customer customer = accountInfoList.get(0).getCustomer();
			System.out.println(
					"Account: " + account.getAccountName() 
					+" #"+account.getAccountNumber() 
					+ " | Status: " + account.getAccountStatus());
			System.out.println(
					"Customer: "+customer.getFirstName() + " " 
					+ customer.getLastName() 
					+ " | Username: " + customer.getUsername() + "(Id: "+customer.getUserId()+")");
			System.out.println("Approve? (y/n) or input X for Exit");
			String content = sc.nextLine().toLowerCase();
			switch (content) {
			case "y":
				adi.approveAccount(account);
				accountInfoList.remove(0);
				break;
				
			case "n":
				adi.cancelAccount(account);
				accountInfoList.remove(0);
				break;
				
			case "x":
				exitFlag = false;
				break;
			default:
				break;
			}
			System.out.println();
			
		}
	}
}
