package com.revature.reverse;

public class Reverse {
	
	public static String reverse(String in){
	String r = "Reverse";
	String n = "";
	
	for(int i = in.length()-1; i >= 0; i--) {
		n += in.charAt(i);
	}
	
	System.out.println(n);
	return n; 
	}
	

}
