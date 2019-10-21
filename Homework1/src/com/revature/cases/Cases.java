package com.revature.cases;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cases {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
	
		switch(choice) {
			case 1:
				System.out.println("The square root of 4 is " + Math.sqrt(4) + ".");
			case 2:
				System.out.println(LocalDateTime.now());
			case 3:
				String full = "I am learning core Java";
				String[] splitted = full.split(" ");
				for(int i = 0; i < splitted.length; i++) {
					System.out.println(splitted[i]);
				}
			default:
				System.out.println("That's not a proper entry.");
		}
		in.close();
	}
}
