package com.revature.homework;

public class Q3 {
	public static String reversestring() {
	String input = "Racecar is the best word backwords";
	
	char[] try1 = input.toCharArray();
	
	for (int i = try1.length-1; i>=0; i--)
		System.out.print(try1[i]);
		System.out.println();
	return input;}

}
