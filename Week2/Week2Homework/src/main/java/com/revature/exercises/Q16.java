package com.revature.exercises;

import java.util.Scanner;

public class Q16 {
	public static void stringScan() {
		  Scanner scan = new Scanner(System.in);

	      System.out.print("Enter any string: ");
	      String Str1 = scan.next();
	      System.out.println(Str1);
	      
	      String s = Str1;
	      for (int i = 0; i < s.length(); i++) {
	        System.out.print(s.charAt(i)+ " ,");
	      }
	 }

}
