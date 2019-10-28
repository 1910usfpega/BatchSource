package com.bankofdoom.driver;

import java.sql.SQLException;

import com.bankofdoom.bean.User;
import com.bankofdoom.daoimpl.UserDaoImpl;
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
		
		UserDaoImpl ud = new UserDaoImpl();
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
		
		MenuMethod.displayLoginMenu();
	}
}
