package com.revature.q16;

public class StringCharCount {
	
	public static void numChars(String[] args) {
		System.out.println("Q16");
		int count = 0;
		
		//Get character count from each string and display total
		for (String s : args) { count += s.length(); }
		System.out.println("Character count: " + count + "\n");
		
	}
	
}