package com.revature.homework;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/******************************************************************************
 * Q8. Write a program that stores the following strings in an ArrayList and 
 *  		saves all the palindromes in another ArrayList.
 *  		“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  
 *  		“refer”, “billy”, “did”
 *  
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question8Test {

	String[] start = {"karan", "madam", "tom", "civic", "radar", 
					"jimmy", "kayak", "john","refer", "billy", "did"};
	
	String[] palindrome = {"madam", "civic","radar","kayak","refer","did"};
	
	@Test
	void testArray() {
		
		Question8 q = new Question8();
		//Employee[] r = resultList.toArray(new Employee[resultList.size()]);
		String[] result = new String[start.length];
		ArrayList<String> r = q.createArrayList(start);
		result = r.toArray(new String[r.size()]);
		
		
		assertArrayEquals(start,result);
	}
	
	@Test
	void testPalin() {
		Question8 q = new Question8();
		//q.createArrayList(start);
		
		String[] result = new String[palindrome.length];
		ArrayList<String> r = Question8.pally;
		result = r.toArray(new String[r.size()]);
		
		
		assertArrayEquals(palindrome, result);
		
		
	}

}
