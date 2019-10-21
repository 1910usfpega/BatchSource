package com.revature.homework;

import java.util.Scanner;

public class Question14 {
	public static void Cooper (String str) {
		Scanner input=new Scanner(System.in);
		System.out.println("Question 14");
		System.out.println("Enter Number:");
		double num=input.nextDouble();
		System.out.println("1 Print Square Root");
		System.out.println("Display today's date");
	    System.out.println("What do I learn?");
		System.out.println("Enter your choice:");
		
		
		int choice=input.nextInt();
		switch(choice) {
		case 1:
			int b=22;
			System.out.println("Sqaure Root of b"+(Math.sqrt(num)));
			break;
			
		case 2:
			String d= "October 18, 2019";
			System.out.println(d);
			break;
			
		case 3:
			String c= "I am learning Core Java";
			System.out.println(c);
			break;
			default:
				System.out.println("Laker Nation!");
			
			
			
		}
		
		
	}

}
