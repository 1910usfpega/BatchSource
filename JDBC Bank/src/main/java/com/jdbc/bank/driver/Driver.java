package com.jdbc.bank.driver;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jdbc.bank.bean.User;
import com.jdbc.bank.daoimple.UserDoaImple;

public class Driver {

	public static void main(String[] args) throws SQLException {
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
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
		
		Date date = new Date(System.currentTimeMillis());
		
		test.setAddress("356 Honey Trail Garden AL, 534-453-3453");
		test.setEmail("johnisadummy@dumbmail.edu");
		test.setFullName("John Jennings");
		test.setPassword(2343423);
		test.setUName("test1");
		test.setPhoneNumber("205-234-2345");
		
		System.out.println(test);
		t1.createsUser(test);
		
		
	}

}
