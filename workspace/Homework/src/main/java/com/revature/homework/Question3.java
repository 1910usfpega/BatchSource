package com.revature.homework;


/******************************************************************************
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question3 {

	public String reverseString(String str) {
		
		if(str.length()<2) return str;
		
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
