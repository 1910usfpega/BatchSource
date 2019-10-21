package com.revature;

public class SubString {
	public static char subStringer(String string, int index) {
		System.out.println("String : "+ string);
		char[] b = string.toCharArray();
		for (int i =0;i<index;i++) {
			System.out.println(b[index]);
			return (char) b[index];
		}
		return 0;
	}
}
