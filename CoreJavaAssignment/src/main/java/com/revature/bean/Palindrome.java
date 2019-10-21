package com.revature.bean;

import java.util.ArrayList;

public class Palindrome {
	
/*Write a program that stores the following strings in an ArrayList 
 * and saves all the palindromes in another ArrayList.
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
	
	public ArrayList<String> findPalindrome(ArrayList<String> list){
		
		ArrayList<String> pal = new ArrayList<String>();
		
		for(String s: list) {
			for(int n = 0; n < s.length(); n++)
			{
				if ((s.charAt(n)== s.charAt(s.length()-(n+1)))&& (n == s.length()-1)){
					pal.add(s);
					
				}
			}
	         	         
		}
		
		return pal;
	}

}
