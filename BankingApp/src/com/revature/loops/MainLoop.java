package com.revature.loops;

import java.util.Scanner;

import com.revature.bean.Login;
import com.revature.bean.Logon;
import com.revature.bean.User;
import com.revature.io.IOWithCollections;

public class MainLoop {
	public static Scanner sc = new Scanner(System.in);
	public static User currentUser = null;
	
	public static void main() {
		while (true) {
			String contents = null;
			System.out.println("\n\n======BANKING APP======\n\nWhat would you like to do?\n1. Login 1\n2. Register new Account");
			System.out.print("Input number of action: ");
			//(contents = sc.nextInt()) !=0
			
			while ((contents = sc.nextLine())!= null) {
				if (contents.equals("1") || contents.equals("2")) {
					break;
				} else {
					System.out.println("Input 1 or 2");
				}
			} 
			
			
			if (contents.equals("1")) {
				System.out.println("Start Login process");
				currentUser = Login.loginProcess(IOWithCollections.usersList);
			} else if (contents.equals("2")) {
				System.out.println("Start Logon process");
				currentUser = Logon.logonProcess(IOWithCollections.usersList);
				IOWithCollections.usersList.add(currentUser);
				IOWithCollections.writeUserFile();
			}
			
			
			if (!currentUser.equals(null)) {
				currentUser.showMenu();
			}
		}
		
	}
	
	
}
