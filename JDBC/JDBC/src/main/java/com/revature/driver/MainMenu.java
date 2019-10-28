package com.revature.driver;




import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.beans.CustomerMenu;
import com.revature.beans.Employee;
import com.revature.beans.Users;
//import com.revature.usersdaoimpl.UsersDaoImpl;
import com.revature.usersdaoimpl.UsersDaoImpl1;





public class MainMenu {
	public static void main(String[] args) {
		
	
	
		  System.out.println("Welcome to JDBC Bank!");
		  System.out.println("New User or Returning User?");
		  System.out.println("Enter 1 for Customer");
		  System.out.println("Enter 4 for New Customer");
		  System.out.println("Enter 2 for Employee");
		  System.out.println("Enter 3 for Admin");
		  
		  Scanner in = new Scanner(System.in);
		  
		  String key= in.next();

		  				switch(key) {
						case "1":
						UsersDaoImpl1.customerlogin(in); 
						break;
	  				    case "2": 
	  				    com.revature.beans.Employee.employeelogin();
		  				break;
		  				case"3": 
		  				com.revature.beans.AdminMenu.adminmenu(in);
		  				break;
		  				case "4":
		  				Users.customerinfo();
		  				break;
		  				default: 
		  				System.out.println("Invalid Menu Option!");
		  
	
	

	}

	}
}


