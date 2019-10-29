package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.util.GlobalStorageSingletone;

public class MainLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		boolean exit = false;
		
		
		
		while (!exit) {
			String contents = null;
			System.out.println("\n\n====================\n"
								 + "      AWESOME     \n"
								 + "      FUTURISTIC  \n"
								 + "      BLOCKCHAIN  \n"
								 + "      MACHINE     \n"
								 + "      LEARNING    \n"
								 + "      BANKING     \n"
								 + "      APP \n"
								 + "====================\n\n");
			System.out.println("What would you like to do?\n"
					+ "1. Sign in \n"
					+ "2. Sign up\n"
					+ "Input number of action:");
			
			contents = sc.nextLine();
			switch (contents) {
			case "1":
				MainSigninLoop.start();
				if (gss.getCurrentUser()!= null) {
					User currentUser = gss.getCurrentUser();
					currentUser.showMenu();
				}
				break;
				
			case "2":
				MainSignupLoop.start();
				break;
				
			default:
				System.out.println("Input 1 or 2");
				break;
			}
		}
	}
}
