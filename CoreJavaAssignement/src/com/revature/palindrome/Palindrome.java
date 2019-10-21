package com.revature.palindrome;
/*
 * Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.

 */

public class Palindrome {
	


	public static  void arrayLists(){
		

		
        String[] words = new String[]{"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        
		String reverseString = "";
		 
		for (int i = 0; i < words.length; i++) 
		{
		    String word = words[i];
		     
		    String reverseWord = "";
		     
		    for (int j = word.length()-1; j >= 0; j--) 
		    {
		        reverseWord = reverseWord + word.charAt(j);
		    }
		     
		    reverseString = reverseString + reverseWord + " ";
		}
		 
		 
		System.out.println(reverseString);
	 }
}
