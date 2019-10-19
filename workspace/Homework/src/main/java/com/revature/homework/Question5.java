package com.revature.homework;


/******************************************************************************
 *  Q5. Write a substring method that accepts a string str and an integer 
 *      idx and returns the substring contained between 0 and idx-1 inclusive.
 *      Do NOT use any of the existing substring methods in the String, 
 *      StringBuilder, or StringBuffer APIs.
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question5 {

	public String newString(String str, int idx) {
		char[] tmp=str.toCharArray();
		String result="";
		
		if(idx==0) 
			result +=tmp[0];
		
		for(int i=0;i<idx;i++) {
			result +=tmp[i];
		}
		return result;
		
	}
}
