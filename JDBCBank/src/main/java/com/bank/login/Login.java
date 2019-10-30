package com.bank.login;

import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.bank.bean.Users;


public class Login {
	
	public static Scanner sc = new Scanner(System.in);
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
	
	public static Users loginProcess(List<Users> usersList) {
		
		Users currentUser = null;
		Integer numberofattempts = 0; 
		
		
		while (currentUser==null && numberofattempts < 3)	{//we will have 3 attempts to login, otherwise we go back to the MainLoop.main();
			String loginFromUser =  Login.getLoginFromSC();
			String passFromUser = Login.getPasswordFromSC();
					
			try {
				currentUser = Users.login(loginFromUser, passFromUser, usersList);
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