package com.revature.exercises;

import java.util.Scanner;

public class Q14Input {
	public static void scanningInput() {
		  Scanner scany = new Scanner(System.in);

	      System.out.print("Enter a string: ");
	      String Str1 = scany.next();
	      System.out.println(Str1);
	      
	      String s = Str1;
	      for (int i = 0; i < s.length(); i++) {
	        System.out.print(s.charAt(i)+ " ,");
	      }
	 }

}
