package com.john;

/**
 * Write a program to display the number of characters
 *  for a string input. The string should be entered
 *   as a command line argument using (String [ ] args).

 * @author johnljennings
 *
 */

public class Q16NumOfChar {
	
	public static void count(String s) { 
        int num = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) != ' ') 
            num++; 
        }  
        System.out.println("Number of Characters: " + num);
    } 
	
}
