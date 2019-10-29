package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bean.User;
import com.revature.daoimpl.AccountDaoImpl;

public class Driver {
	
	public static void main(String[] args) {
		
		public static Scanner sc = new Scanner(System.in);
		public static User currentUser = null;
		
		
		
		
		
		
		
		AccountDaoImpl acc = new AccountDaoImpl();
		try {
			System.out.println(acc.getAllAccounts());
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
	}

}
 