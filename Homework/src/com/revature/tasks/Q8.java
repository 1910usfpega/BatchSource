package com.revature.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.revature.driver.Palindrome;

public class Q8 {
	// Write a program that stores the following strings in an ArrayList 
	// and saves all the palindromes in another ArrayList.
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q8");
		
		List<String> words = Stream.of("karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did").collect(Collectors.toList());
		System.out.println("Input: "+words.toString());
		List<String> palindromes = new ArrayList<String>();
		
		for (String word:words) {
			if (Palindrome.isPalindrome(word)) {
				palindromes.add(word);
			}
		}
		
		System.out.println("Palindromes: " + palindromes.toString());
	}
}
