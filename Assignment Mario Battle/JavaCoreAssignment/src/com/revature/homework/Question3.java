package com.revature.homework;

public class Question3 {

	public static String   reversal(String str) {
		char [] c = str.toCharArray();
		for(int i=str.length()-1; i>-1;i--) {
			System.out.print(c[i]);
			
		}
		
		return "\n";
	}

}
