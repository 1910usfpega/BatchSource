package com.revature.substring;

public class Substring {
	
	public static String substring(String str, int n) {
		
		String sub = "";
		for (int i = 0; i < n; i++) {
			sub += str.charAt(i);
		}
		
		System.out.println(sub);
		
		return sub; 
	}

}
