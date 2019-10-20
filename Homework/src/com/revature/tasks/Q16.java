package com.revature.tasks;

import java.util.Scanner;

public class Q16 {
	
	/*
	 * Write a program to display the number of characters for a string input. 
	 * The string should be entered as a command line argument using (String [ ] args).
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void driver() {
		String contents;
		System.out.println("To test with command line arguments run command \"java Q16\" with string as a paramter");
		
		// pwd: /Users/Iskandar/Documents/Developing/revature/BatchSource/Homework/src
		// javac com/revature/tasks/Q16.java
		// java com.revature.tasks.Q16 "Test sting"
		
		
		System.out.println("Or input your string here:");
		contents = sc.nextLine();
		System.out.println("You entered: " + contents);
		System.out.println("Length of this string:" + contents.length());
		
	}
	
	public static void main(String [] args) {
		if (args.length==0) {
			System.out.println("String shouldn't be empty");

		} else if (args.length==1){
			System.out.println("Number of characters: "+args[0].length());
		} else {
			System.out.println("You entered many arguments. I will concantinate it before");
			String full_ss = "";
			
			for (String ss:args) {
				full_ss = full_ss.concat(ss + " ");
			}
			System.out.println("Number of characters: "+(full_ss.length()-1));
		}
		
	}
}
