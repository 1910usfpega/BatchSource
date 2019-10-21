package com.revature.bean;

import java.util.Scanner;

public  class Employee {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 2 for Employee");
		
		
		int num = in.nextInt();
		if(num ==2) {
			if (num ==2) {
				
			}
		System.out.println("Hello Employee!");
		}
	}
			
//		String user, pass;
//		
//		System.out.println("Enter your username:");
//		user= in.next();
//
//		
//		if(user.equals("Eddie")) {
//			System.out.println("Enter your password:");
//			pass = in.next();
//			if (pass.equals("Hardy")) {
//			System.out.println("Welcome Employee");
//			
//			} else {
//				System.out.println("You have entered wrong  password:");
//			
//			}
//			
//		}
//		
//		else {
//				System.out.println("You have entered wrong username");
//		
//				
//			
//		}
//		
//		}
//	}
	
public static void employeelogin() {
	System.out.println("Hello Employee!");
	



String user, pass;

System.out.println("Enter your username:");

user= in.next();


if(user.equals("Eddie")) {
System.out.println("Enter your password:");
pass = in.next();
if (pass.equals("Hardy")) {
System.out.println("Welcome Employee");

} else {
System.out.println("You have entered wrong  password:");

}

}

else {
System.out.println("You have entered wrong username");



}

}

}
	
	

	