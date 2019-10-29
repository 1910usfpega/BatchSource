package com.jdbc.bank.driver;

import java.util.Date;

import com.jdbc.bank.bean.User;
import com.jdbc.bank.daoimple.UserDoaImple;

public class Driver {

	public static void main(String[] args) {
		UserDoaImple t1 = new UserDoaImple();
		
		/*
		 * int userID, String uName, double password, 
			Date dateOfBirth, String fullName, String email,
			String address, String phoneNumber
		 */
		
		User test = new User();
		/*
		 * 36565, "devazn", 
				2345234.00, ,
				 "John Jennings",
				 "johnisadummy@dumbmail.edu",
				
		 */
		test.setAddress("356 Honey Trail Garden AL, 534-453-3453");
		test.setDateOfBirth();
		test.setEmail("johnisadummy@dumbmail.edu");
		test.setFullName("John Jennings");
		test.setPassword(2343423);
		test.setUName("devazn");
		test.setPhoneNumber("205-234-2345");
		
		
	}

}
