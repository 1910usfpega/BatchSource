package com.revature.loops;

import java.util.List;
import java.util.Scanner;

import com.revature.beans.User;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class AdminAllUsersLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		boolean allUsersFlag = false;
		do {
			UserDaoImpl udi = new UserDaoImpl();
			System.out.println("\n\nALL BANK CUSTOMERS:");
			List<User> allBankUsers = udi.getAllUsers();
			
			for (User user:allBankUsers) {
				System.out.format("Id: %s (%s)| Full name: %s %s\n", 
						user.getUserId(), 
						user.getUsername(),
						user.getFirstName(), 
						user.getLastName()
						);
			}
			
			boolean stopFlag = true;
			
			while (stopFlag) {
				System.out.println("Input user ID to work with specific user \n"
						+ "or input X to come back to main menu");
				if (sc.hasNextInt()) {
					int userId = sc.nextInt();
					if (checkIfUserIdExistsInList(userId, allBankUsers)) {
						AdminUserLoop.start(userId);
						allUsersFlag = true;
						stopFlag = false;
					}
				} else {
					String content = sc.nextLine().toLowerCase();
					if (content.equals("x")) {
						stopFlag = false;
					}
					
				}
			}
		
		} while (allUsersFlag);
	}
	
	
	public static boolean checkIfUserIdExistsInList (int userId, List<User> usersList) {
		for (User u:usersList) {
			if (u.getUserId().equals(userId)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
