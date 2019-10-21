package com.revature.assignment;

public class Q3 {

	public static String reverseString(String str) {
		if((str == null) || (str.length() <= 1)) {
			return str;
		}
		 return reverseString(str.substring(1)) + str.charAt(0);
	}

}
