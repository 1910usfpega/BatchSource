package com.revature.tasks;

import java.util.Scanner;

public class Q16 {
	
	/*
	 * Write a program to display the number of characters for a string input. 
	 * The string should be entered as a command line argument using (String [ ] args).
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	// TO RUN IN CONSOLE:
	// pwd: /Users/Iskandar/Documents/Developing/revature/BatchSource/Homework/src
	// javac com/revature/tasks/Q16.java
	// java com.revature.tasks.Q16 "Test sting"

	
	public static void main(String [] args) {
		
		System.out.println();
		System.out.println("==> Q16");
		
		if (args.length==0) {
			System.out.println("String shouldn't be empty");

		} else if (args.length==1){
			System.out.println("Number of characters: "+args[0].length());
		} else {
			System.out.println("You entered many arguments. I will concantinate it before");
			String full_ss = concatArgs(args);
			
			for (String ss:args) {
				full_ss = full_ss.concat(ss + " ");
			}
			System.out.println("Number of characters: "+(full_ss.length()-1));
		}
		
	}
	
	public static String concatArgs (String [] args) {
		String full_ss = "";
		
		for (String ss:args) {
			full_ss = full_ss.concat(ss + " ");
		}
		return full_ss;
	}
}
