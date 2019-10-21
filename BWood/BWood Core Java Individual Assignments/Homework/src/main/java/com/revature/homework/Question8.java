package com.revature.homework;

import java.util.ArrayList;

/******************************************************************************
 * Q8. Write a program that stores the following strings in an ArrayList and 
 *  		saves all the palindromes in another ArrayList.
 *  		“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  
 *  		“refer”, “billy”, “did”
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question8 {

	public static ArrayList<String> pally = new ArrayList<String>();
	
	public ArrayList<String> createArrayList(String[] l) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(String i:l) {
			result.add(i);
			if(i.equals(new StringBuilder(i).reverse().toString())) {
				pally.add(i);
			}
		}
		return result;
		
	}
}
