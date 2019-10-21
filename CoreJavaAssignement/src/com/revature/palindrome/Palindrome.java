package com.revature.palindrome;
/*
 * Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.

 */

public class Palindrome {
	


		
	public static void arrayLists() {	
		String[] thisIsAStringArray = new String[] {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};

		String name = thisIsAStringArray[j];
		String reverse = "";
		int arrayLength = thisIsAStringArray.length;
		for ( int j = 0; j<=arrayLength; j++) {	
			for (int i=name.length();i>0;--i) {	
				
				reverse=reverse+(name.charAt(i-1));	
		     }		

		}
		System.out.println(reverse); 
	 }
	
}
