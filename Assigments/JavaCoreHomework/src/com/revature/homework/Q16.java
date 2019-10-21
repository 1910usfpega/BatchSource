package com.revature.homework;

public class Q16 {
	public static String StringCount() {
		String string = "Java is amazing";
		int count = 0;
		
		for(int i = 0; i<string.length(); i++) {
			if(string.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: "+ count);
		
	return "String Count";}

}
