package com.revature.bean;

import java.util.Scanner;

public class Customer {
 public static void customerlogin() {
	 System.out.println("Hello Valued Customer!");
	 String user, pass;
		
		System.out.println("Enter your username:");
		user= in.next();

		
		if(user.equals("Kyle")) {
			System.out.println("Enter your password:");
			pass = in.next();
			if (pass.equals("Ansley")) {
			System.out.println("Welcome Valued Customer!");
			
			} else {
				System.out.println("You have entered wrong  password:");
			
			}
			
		}
		
		else {
				System.out.println("You have entered wrong username");
				
		
				
			
		}
	 
 }
	

	static Scanner in = new Scanner(System.in);
	
public static void main(String[] args) {
	System.out.println("Enter 1 for Customer");
	System.out.println("Enter 4 for New Customer");
	
	
	int num = in.nextInt();
	if(num ==1) {
		if (num ==1) {
			
			
			
			}
		
//	
//	String user, pass;
//	
//	System.out.println("Enter your username:");
//	user= in.next();
//
//	
//	if(user.equals("Kyle")) {
//		System.out.println("Enter your password:");
//		pass = in.next();
//		if (pass.equals("Ansley")) {
//		System.out.println("Welcome Valued Customer!");
//		
//		} else {
//			System.out.println("You have entered wrong  password:");
//		
//		}
//		
//	}
//	
//	else {
//			System.out.println("You have entered wrong username");
//			
//	
//			
//		
//	}
//	
	}
	//else if (num == 4)
		
		//newuserlogin();
//		System.out.println("Welcome New Customer!");
//		System.out.println("Please Choose a Username:");
//		String username = in.next();
//		String password = null;
//		while (password == null){
//			System.out.println("Please Choose a Password:");
//			String password1 = in.next();
//			System.out.println("Please retype your password");
//			String password2 = in.next();
//			
//			if (password1.equals(password2)) {
//				password=password1;
//			}else {
//				System.out.println("Passwords do not match, Please try again");
//				
//			}
//			
//		}
//		System.out.println("You have successfully created your log in!" );
//		
		
	
}


	// TODO Auto-generated method stub
	

//public static void newuserlogin() {
//	
//	
//	
//	System.out.println("Welcome New Customer!");
//	System.out.println("Please Choose a Username:");
//	String username = in.next();
//	String password = null;
//	while (password == null){
//		System.out.println("Please Choose a Password:");
//		String password1 = in.next();
//		System.out.println("Please retype your password");
//		String password2 = in.next();
//		
//		if (password1.equals(password2)) {
//			password=password1;
//		}else {
//			System.out.println("Passwords do not match, Please try again");
//			
//		}
//		
//	}
//	System.out.println("You have successfully created your log in!" );
//	
//	
//}
//
//
//	
}




