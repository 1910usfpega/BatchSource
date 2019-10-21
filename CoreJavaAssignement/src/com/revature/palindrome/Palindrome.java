package com.revature.palindrome;
/*
 * Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
	


	public static  void arrayLists(){
		
        String[] words = new String[]{"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        System.out.println("Original List: " + Arrays.toString(words));
        
		String reverseWords = "";
		String[] reverseWordList;
		ArrayList<String> palindromList = new ArrayList<String>();
        
		for (int i = 0; i < words.length; i++) 
		{
		    String word = words[i];
		     
		    String reverseWord = "";
		     
		    for (int j = word.length()-1; j >= 0; j--) 
		    {
		        reverseWord = reverseWord + word.charAt(j);
		       
		    }
		     
		    reverseWords = reverseWords + reverseWord + ",";
		}
		reverseWordList = reverseWords.split(",");
		System.out.println("Reversed Original List: " + Arrays.toString(reverseWordList));
		
		for (int i = 0; i < words.length; i++)
		{
			if(words[i].equals(reverseWordList[i])) {
				
				palindromList.add(words[i]);
				//System.out.println(palindromList.toString());
			}
		}
		
		
		
		System.out.println("The palindromes list is: " + palindromList.toString());
		
		
		
		
	 }
}
