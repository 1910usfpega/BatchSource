package com.revature.driver;

import java.util.Scanner;

public class Driver {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contents = null;
		System.out.println("What would you like to do?\nLogin press 1\nLogon press 2");
		System.out.println(sc.hasNextInt());
		//(contents = sc.nextInt()) !=0
		while ((contents = sc.nextLine())!= null) {
			if (contents.equals("1") || contents.equals("2")) {
				break;
			} else {
				System.out.println("Input 1 or 2");
			}
		} 
		
		System.out.println("Outside while" + contents);
		
		
		if (contents.equals("1")) {
			System.out.println("Login process");
		} else if (contents.equals("2")) {
			System.out.println("Logon process");
		}
//		int contents;
//		System.out.println("What would you like to do?\nLogin press 1\nLogon press 2");
//		while (!sc.hasNextInt()) {
//			if (sc.hasNextInt()) {
//				contents = sc.nextInt();
//				if (contents == 1) {
//					System.out.println("Login process");
//				} else if (contents == 2) {
//					System.out.println("logon process");
//				} else {
//					
//				}
//			} else {
//				System.out.println("press 1 or 2 ");
//			}
//			
//		}
		
	}

}
