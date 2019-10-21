package com.john;

public class Q3ReverseString {
	
	public static String backwards(String str) {
	    if  (str.length() <= 1) {
	        return str;
	    }
	    return backwards(str.substring(1)) + str.charAt(0);
	}

}
