package com.revature.driver;

import java.util.Scanner;

import com.revature.bean.Admin;
import com.revature.bean.Customer;
import com.revature.bean.Employee;

public class MainMenu {

	public static void main(String[] args) {
		System.out.println("Welcome to Baby Driver");
		System.out.println("New User or Returning User?");
		System.out.println("Enter 1 for Customer");
		System.out.println("Enter 4 for New Customer");
		System.out.println("Enter 2 for Employee");
		System.out.println("Enter 3 for Admin");
		
		Scanner in = new Scanner(System.in);
		
		String key= in.next();
	
	switch(key) {
	case "1":
		Customer.customerlogin(); 
		break; 
	case "4":
		IOUser.newuserlogin();
		break;
	case "2":
		Employee.employeelogin();
		break;
	case"3":
		Admin.adminlogin();
		break;
	case "5":
		IOUser.readUserFile();
		break;
	case "6":
		IOUser.customerinfo();
		IOUser.writeUserFile();
		break;
	
		
		default:
			System.out.println("Invalid Menu Option!");
			
		IOUser.customerinfo();
		IOUser.writeUserFile();
		
		

	}

	}
}
