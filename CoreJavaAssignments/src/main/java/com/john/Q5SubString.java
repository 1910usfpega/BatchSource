package com.john;

public class Q5SubString {
	
	public static void subString() {
		
//		char[] sub = str.toCharArray();
		String input = "Zelda";
		String firstThreeChars = ("");
		if (input.length() > 3) {
			//.substring selects sections of your String chars as an index.
		    firstThreeChars = input.substring(0, 3);
		}
		else
		{
		    firstThreeChars = input;
		}
		 
		System.out.println(firstThreeChars);
	}
		
}
