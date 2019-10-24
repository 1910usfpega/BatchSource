package com.revature.bean;

public class ReverseString {

	
	
	public String stringReverse(String s) {
		 
		for(int n = s.length()-1; n > -1; n--) {
			s = s + s.charAt(n);

		}
		return s.substring(s.length()/2, s.length());
	}
	

}
