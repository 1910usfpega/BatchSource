package com.revature.bean;

import java.util.List;
import java.util.Scanner;

public class Login {

	
	public static Scanner sc= new Scanner(System.in);
	

	
	public static String getLoginFromSC(){
		String contents;
		System.out.println("Type the Username");
		contents = sc.nextLine();
		return contents;
		
	}
	
	public static String getPasswordFromSC(){
		String contents;
		System.out.println("Type the Password");
		contents = sc.nextLine();
		return contents;
		
	
	}
	
	public static User loginProcess(List<User> usersList) {
		
		User currentUser = null;
		
		while (currentUser==null)	{
			String login =  Login.getLoginFromSC();
			String pass = Login.getPasswordFromSC();
					
			try {
				currentUser = User.login(login, pass, usersList);
//				System.out.flush(); 
				return currentUser;
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("No such Unsername or password. Try again!");
			} 
			
			
		}
		return currentUser;
	}
	
	

}
