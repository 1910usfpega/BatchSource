package com.bankofdoom.driver;

import java.sql.SQLException;

import com.bankofdoom.bean.User;
import com.bankofdoom.daoimpl.UserDaoImpl;

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
		UserManager um = new UserManager();
		UserDaoImpl ud = new UserDaoImpl();
		User test = new User("woodb","password".hashCode(),
				"Brained Wood","1 Test Pl Tampa FL 33613",
				"woodb@test.com","	(555)555-5555");
		
		try {
			//ud.createLogin(test);
			ud.createNewUser(test);
		} catch (SQLException e) {
			System.out.println("Failed nice try");
			e.printStackTrace();
		}
		
		
	}
}
