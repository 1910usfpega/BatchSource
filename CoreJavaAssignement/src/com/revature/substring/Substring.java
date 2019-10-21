package com.revature.substring;

import java.util.Scanner;

/*
 * Q5. Write a substring method that accepts a string str and an integer idx and returns
 *  the substring contained between 0 and idx-1 inclusive.  Do NOT use any of the existing 
 *  substring methods in the String, StringBuilder, or StringBuffer APIs.

 */

public class Substring {

	public static Scanner sc= new Scanner(System.in);

	public static void substring() {
		
		System.out.println("Type a word or phrase");
		String str=sc.nextLine();	
		System.out.println("At what intdex would you like the reverse substring to start ? ");
		String idx=sc.nextLine();
		int x = Integer.parseInt(idx);
		char[] chars = str.toCharArray();
        for (int i = 0; i <=x-1; i++) { 
            System.out.print(chars[i]); 
        }		
	}
	
//	public static void main(String[] args) {
//			
//		System.out.println("Type a word or phrase");
//		String str=sc.nextLine();	
//		System.out.println("At what intdex would you like the reverse substring to start ? ");
//		String idx=sc.nextLine();
//		int x = Integer.parseInt(idx);
//		substring(str, x);
//
//	}
	
	
}

	



