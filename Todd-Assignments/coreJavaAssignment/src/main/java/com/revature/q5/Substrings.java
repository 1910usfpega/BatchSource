package com.revature.q5;

public class Substrings {
	
	public static String getSubstring(String s, int idx) {
		System.out.println("Q5");
		
		String sub = "";
		for(int i=0; i<idx; i++) {
			 sub += s.charAt(i);
		}
		
		return sub;
	}
	
}
