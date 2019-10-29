package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class AdminUserLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	
	public static void start(int userId) {
		boolean drive2 = true;
		while (drive2) {
			UserDaoImpl udi = new UserDaoImpl();
			User currentUser = udi.getUserById(userId);
			System.out.println("\n\n\n\n\n==============");
			System.out.format("UserID: %s\n"
							+ "Username: %s\n"
							+ "Full name: %s %s\n", 
								currentUser.getUserId(),
								currentUser.getUsername(),
								currentUser.getFirstName(),
								currentUser.getLastName()
							);
			System.out.println("What would you like to do?");
			System.out.println("1. Update this user");
			System.out.println("2. Delete this user");
			System.out.println("3. Back to users list");
			System.out.println("Input action number:");
			
			String content = sc.nextLine().toLowerCase();
			switch (content) {
			case "1":
				break;
				
			case "2":
				udi.deleteUserById(userId);
				System.out.println("User #"+currentUser.getUserId()+" deleted!");
				drive2 = false;
				break;
				
			case "3":
				drive2= false;
				break;
			default:
				break;
			}
		}
	}
}
