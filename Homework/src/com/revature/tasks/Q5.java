package com.revature.tasks;

import utils.SubStringFun;

public class Q5 {
	/*
	 * Write a substring method that accepts a string str and an integer idx 
	 * and returns the substring contained between 0 and idx-1 inclusive.  
	 * 
	 * Do NOT use any of the existing substring methods 
	 * in the String, StringBuilder, or StringBuffer APIs.
	 */
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q5");
		String ss_in = "SomeStringString";
		Integer idx = 3;
		String ss_out = SubStringFun.substring(ss_in, idx);
		System.out.println("Sustring of string \""+ ss_in + "\" is: " + ss_out);
	}
}
