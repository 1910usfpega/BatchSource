package com.revature.loops;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.AccountDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class CustomerApplyNewBankAccountLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		Boolean accountTypeFlag = true;
		String contents = null;
		
		while (accountTypeFlag) {
			System.out.println("Which type of account you want to apply for?");
			System.out.println("1. Checking");
			System.out.println("2. Savings");
			System.out.println("3. Back to Menu");
			contents = sc.nextLine();
			
			
			switch (contents) {
				case "1":
					createNewAccount("Checking");
					accountTypeFlag = false;
					break;
				case "2":
					createNewAccount("Savings");
					accountTypeFlag = false;
					break;
				case "3":
					accountTypeFlag = false;
					break;
	
				default:
					break;
			}
		}
		
	}
	
	public static void createNewAccount(String name) {
		AccountDaoImpl adi = new AccountDaoImpl();
		try {
			int newAccount = adi.createNewBankAccountAndReturnId(name);
			adi.attachAccountToCustomer(newAccount, gss.getCurrentUser().getUserId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
