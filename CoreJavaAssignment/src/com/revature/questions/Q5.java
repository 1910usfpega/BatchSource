package com.revature.questions;

public class Q5 {

	
	public static String subString(String str, int idx) {
		StringBuilder newString=new StringBuilder();
		
		for(int i=0;i<idx;i++) {
			newString.append(str.charAt(i));
		}
		
		
		return newString.toString();
		
	}

}
