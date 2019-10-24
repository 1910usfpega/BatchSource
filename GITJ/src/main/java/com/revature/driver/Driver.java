package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.GroupDaoImpl;


public class Driver {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		GroupDaoImpl acc = new GroupDaoImpl();
		GroupDaoImpl user = new GroupDaoImpl();
		try {
			System.out.print("Balance: ");
			double balance = input.nextDouble();
			System.out.print("Checking(T) or Savings(F): ");
			boolean accountType = input.nextBoolean();
			acc.insertAccount(balance, accountType);
			
			System.out.print("Username: ");
			String username = input.next();
			System.out.print("Password: ");
			String pw = input.next();
			user.insertUser(username, pw);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
