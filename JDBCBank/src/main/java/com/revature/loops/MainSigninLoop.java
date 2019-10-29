package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.exceptions.SignInException;
import com.revature.util.GlobalStorageSingletone;

public class MainSigninLoop {
	public static Scanner sc = new Scanner(System.in);
	
	public static String getLoginFromSC(){
		String contents;
		System.out.println("Input your username:");
		contents = sc.nextLine().toLowerCase();
		return contents;
		
	}
	
	public static String getPasswordFromSC(){
		String contents;
		System.out.println("Input your password:");
		contents = sc.nextLine();
		return contents;
		
	
	}
	
	
	
	public static void start() {
		Integer numberofattempts = 0; 
		GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
		
		while (gss.getCurrentUser() == null && numberofattempts < 3) {
			numberofattempts++;
			String login =  MainSigninLoop.getLoginFromSC();
			String password = MainSigninLoop.getPasswordFromSC();
			
			try {
				gss.setCurrentUser(User.login(login, password));
//				System.out.println(gss.getCurrentUser().toString());
			} catch (SignInException e) {
				System.out.print("\nSuch a login/password pair was not found. ");
				if (numberofattempts<3) {
					System.out.println("You cant try again\n");
				} else {
					System.out.println();
				}
			}
			
		
		
		}
		
		if (numberofattempts >= 3) {
			System.out.println("Too many login attempts\n\n");
		}
	}
}
