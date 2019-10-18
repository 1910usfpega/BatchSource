package com.bankofdoom.driver;

import java.util.Scanner;

public class Driver {		
		private static String s;
		private static String tryAgain = "Please enter Y if you have an existing account \nPlease enter N if you would like to create a new account";
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Welcome to Bank of Doom!");

			System.out.println("Owned by LuthorCorp \nPlease enter Y if you have an existing account \nPlease enter N if you would like to create a new account");
			
			while(sc.hasNext()) {

				s = sc.nextLine();

				if(s.equalsIgnoreCase("exit")) {

					System.out.println("Thank you for choosing Bank of Doom for all "

							+ "your Supervillan Banking needs!");

					break;
				}
				if(s.equalsIgnoreCase("Y")) {
					System.out.println("Please enter username below:");
					//if(s.equals(userName)) {
						System.out.println("Please enter password below:");
					}
				}
				 if(s.equalsIgnoreCase("N")) {
					System.out.println("Thank you for choosing Bank of Doom, please create new username below:");

			}
				else System.out.println(tryAgain); 
				 
				 sc.close();
				}
			
		}
		

