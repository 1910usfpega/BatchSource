package com.revature.questions;

public class Q3 {
	
	
	public static String reverse(String myString) {
		StringBuilder newString = new StringBuilder();
		for(int i=myString.length()-1;i>=0;i--) {
			newString.append(myString.charAt(i));
		}
		return newString.toString();
	}

}
