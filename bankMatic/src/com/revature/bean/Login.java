package com.revature.bean;

import java.util.List;
import java.util.Scanner;

import com.revature.loops.MainLoop;

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
		Integer numberofattempts = 0; 
		
		
		while (currentUser==null && numberofattempts < 3)	{//we will have 3 attempts to login, otherwise we go back to the MainLoop.main();
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
			numberofattempts++;
			
		}
		return currentUser;
	}
	
	

}
