package com.revature.homework;

public class Question18sub {

	public static void checkForUpper(String str) {
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				System.out.print(" True |");
			}
			else {System.out.print(" False |");}	
		}
	}
	public static void convertToUpper(String str) {
		String ing =str.toUpperCase();
		System.out.println(" ");
		System.out.println(ing);
	}
	public static void convertToInt(String str) {
		int ing = Integer.parseInt(str);
		ing=ing+10;
		String string = Integer.toString(ing);
		System.out.println(string);
	}
}
