package com.revature.bean;

import java.util.Scanner;

public class Admin {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 3 for Admin");

		//		int num = in.nextInt();
		//		if(num ==3) {
		//			if (num ==3) {
		//				System.out.println("Hello Admin!");
		//				
		//				}
		//			
		//		
		//		String user, pass;
		//		
		//		System.out.println("Enter your username:");
		//		user= in.next();
		//
		//		
		//		if(user.equals("Matt")) {
		//			System.out.println("Enter your password:");
		//			pass = in.next();
		//			if (pass.equals("Kitten")) {
		//			System.out.println("Welcome Admin!");
		//			
		//			} else {
		//				System.out.println("You have entered wrong  password:");
		//			
		//			}
		//			
		//		}
		//		
		//		else {
		//				System.out.println("You have entered wrong username");
		//		
		//				
		//			
		//		}
		//		
		//		}
		//	}
		}

		public static void adminlogin() {
			int num = in.nextInt();
			if(num ==3) {
				if (num ==3) {
					System.out.println("Hello Admin!");

				}


				String user, pass;

				System.out.println("Enter your username:");
				user= in.next();


				if(user.equals("Matt")) {
					System.out.println("Enter your password:");
					pass = in.next();
					if (pass.equals("Kitten")) {
						System.out.println("Welcome Admin!");

					} else {
						System.out.println("You have entered wrong  password:");

					}

				}

				else {
					System.out.println("You have entered wrong username");



				}

			}
		}
	}


