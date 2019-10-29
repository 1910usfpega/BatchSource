package com.revature.loops;

import java.util.Scanner;

import com.revature.util.GlobalStorageSingletone;

public class AdminMenuLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		boolean drive = true;
		
		while (drive) {
			System.out.println("YOU ARE IN ADMIN MENU");
			System.out.println("What would you like to do?");
			System.out.println("1. View all users");
			System.out.println("2. Create new User");
			System.out.println("3. Exit");
			System.out.println("Input number of action:");
			
			String content = sc.nextLine().toLowerCase();
			switch (content) {
			case "1":
				AdminAllUsersLoop.start();
				break;
				
			case "2":
				AdminCreateCustomerLoop.start();
				break;
				
			case "3":
				System.out.println("You Exited from your account\n\n\n");
				drive= false;
				gss.setCurrentUser(null);
				break;
			default:
				break;
			}
		}
	}
}
