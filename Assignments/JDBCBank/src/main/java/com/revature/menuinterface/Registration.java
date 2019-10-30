package com.revature.menuinterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.revature.bean.User;
import com.revature.bean.UserInfo;
import com.revature.daoimpl.InsertDaoImpl;
import com.revature.daoimpl.ViewDaoImpl;

public class Registration {
	
	public void register(Scanner sc) {
		
		UserInfo ui = new UserInfo();
		List<User> ulist = new ArrayList<User>();
		
		ViewDaoImpl viewI = new ViewDaoImpl();
		
		InsertDaoImpl insI = new InsertDaoImpl();
		
		try {
			ulist = viewI.getAllUsers();
		} catch (SQLException e) {

			System.out.println("failed to get list of current users");
			e.printStackTrace();
		}
		

		boolean uniqueName = false;
		while (uniqueName == false) {
			String r1;
			LogIn.clearScreen();
			
			do{
				System.out.println("(Enter \"back\" to go back)");
				System.out.println("Please enter an email as username: ");
				r1 = sc.nextLine();
			}while((isEmailValid(r1)==false) && (!r1.toLowerCase().equals("back")));
			if (r1.toLowerCase().equals("back")) {
				return;
			} else if (AlreadyUsed(r1, ulist) == false) {
				
				ui.setUser_Name(r1);
				
				System.out.println("What would you like your password to be? ");
				r1 = sc.nextLine();
				ui.setPassword(r1);
				
				System.out.println("Please Enter your first Name: ");
				r1 = sc.nextLine();
				ui.setFirstName(r1);
				
				System.out.println("Please enter your last name: ");
				r1 = sc.nextLine();
				ui.setLastName(r1);
				
				System.out.println("Please enter Street address: ");
				r1 = sc.nextLine();
				ui.setAddressln(r1);
				
				System.out.println("Please enter city: ");
				r1 = sc.nextLine();
				ui.setCity(r1);
				
				System.out.println("please enter State: ");
				r1 = sc.nextLine();
				ui.setState(r1);
				
				System.out.println("Please enter Country: ");
				r1 = sc.nextLine();
				ui.setCountry(r1);
				
				System.out.println("Please enter zip: ");
				r1 = sc.nextLine();
				ui.setZip(r1);
				
				System.out.println("Please enter contact number: ");
				r1 = sc.nextLine();
				ui.setContact_num(r1);
				
				ui.setUser_Typ(2); //default 2 
				ui.setEmail(ui.getUser_Name());
				
				try {
					insI.addUser(ui);
				} catch (SQLException e) {
					System.out.println("failed to add user ");
					e.printStackTrace();
				}
				
				System.out.println("New user info added.");
				uniqueName = true;
				
			} else {System.out.println("Sorry, that username has been taken.");}
		
		
		}
		
		
		
		//return ;
	}
	
	
	public  boolean AlreadyUsed(String username, List<User> a) {
		for(int i = 0; i < a.size(); i++) {
			if (a.get(i).getUsername().equals(username)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	

}
