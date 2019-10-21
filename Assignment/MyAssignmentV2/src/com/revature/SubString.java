package com.revature;

public class SubString {

	
	public static void subStringer(String str, int idx) {
		System.out.println("String : "+ str);
		char[] b = str.toCharArray();
		for (int i =0;i<idx;i++) {
			System.out.println(b[idx]);
		}
	}
}
