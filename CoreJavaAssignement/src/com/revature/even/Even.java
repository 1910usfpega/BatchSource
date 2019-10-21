package com.revature.even;

import java.util.Scanner;

//Q6. Write a program to determine if an integer is even without using the modulus operator (%)

public class Even {

	
	public static Scanner sc= new Scanner(System.in);
//	private static int x;
		
	public static void evenornoteven() {
		
		System.out.println("Even or not even. Type the number you would like to check: ");
		String str=sc.nextLine();
		int num = Integer.parseInt(str);

		
		if((num & 1) == 0){ 
			System.out.println("Even number"); 
		}else {
			System.out.println("Odd number"); 
		}
	}

}
