package com.bankofdoom.driver;

import java.sql.SQLException;

import com.bankofdoom.bean.Account;
import com.bankofdoom.daoimpl.AccountDaoImpl;
import com.bankofdoom.display.MenuMethod;

public class Driver {
	/*
	 * johnd password 
	 * janed drowssap 
	 * Dbob Pass*word123 
	 * jimz 321Drow*ssap
	 * imamoderated Pass*word123 
	 * johnd1 Pass*word123 
	 * jimmyd Pass*word123 
	 * johna Pass*word123 
	 * marswi Pass*word123 
	 * ashb43 Pass*word123 
	 * jinkiessc0013 password
	 * woodb password
	 * 
	 * 
	 * 
	 */

	
	public static void main(String[] args) {
		/*
		 * order goes:
		 * int userId, String uName, String name, String address, String email,
		 *  String phoneNumber,
		 * 
		 */
		
		AccountDaoImpl adi = new AccountDaoImpl();
		Account test = new Account(1,true,100,13285,true);
		Account test1 = new Account(2,false,25.43,13272,true);
		Account test2 = new Account(3,true,10000000,13259,true);
		Account test3 = new Account(4,false,1,13246,true);
		Account test4 = new Account(5,false,0,13298,true);
		Account test5 = new Account(6,true,0.21,13233,true);
		try {
			adi.createAccount(test5);
			adi.createAccount(test4);
			adi.createAccount(test3);
			adi.createAccount(test2);
			adi.createAccount(test1);
			adi.createAccount(test);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		User test = new User("jandd","Pass*word123".hashCode(),
//				"Jane Doe","2 Test Dr Tampa FL 33613",
//				"janed@test.com","(111)123-1234");
//		User test1 = new User("dbob","Pass*word123".hashCode(),
//				"Robert Deal","500 Pensylvania Ave Washington D.C. 11111",
//				"bobd@test.com","(123)101-1234");
//		User test2 = new User("jimz","Pass*word123".hashCode(),
//				"William Zulu","1414 Test St Tampa FL 33613",
//				"jimmyz@test.com","(100)123-4321");
//		User test3 = new User("jandd1","Pass*word123".hashCode(),
//				"Jane 1 Doe","2 Test Dr Tampa FL 33613",
//				"jane1d@test.com","(111)123-1234");
//		ud.createLogin(test);
//		ud.createNewUser(test);
//		ud.createLogin(test1);
//		ud.createNewUser(test1);
//		ud.createLogin(test2);
//		ud.createNewUser(test2);
//		ud.createLogin(test3);
//		ud.createNewUser(test3);		
//		try {
//			
//		} catch (SQLException e) {
//			System.out.println("Failed nice try");
//			e.printStackTrace();
//		}
		
		//MenuMethod.displayLoginMenu();
	}
}
