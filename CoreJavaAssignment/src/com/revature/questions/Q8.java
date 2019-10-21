package com.revature.questions;

import java.util.ArrayList;

public class Q8 {
	static ArrayList<String> allWords = new ArrayList<String>();
	static ArrayList<String> palindromes = new ArrayList<String>();

	public static void main(String[] args) {
	
		ArrayList<String> pals=makePalindromes();

		System.out.println("List of given palindromes:");
		System.out.println(pals);

	}
	
	public static ArrayList<String> makePalindromes() {
		allWords.add("karan");
		allWords.add("madam");
		allWords.add("tom");
		allWords.add("civic");
		allWords.add("radar");
		allWords.add("jimmy");
		allWords.add("kayak");
		allWords.add("john");
		allWords.add("refer");
		allWords.add("billy");
		allWords.add("did");
		
		System.out.println("Full list of given words:");
		System.out.println(allWords);
		
		for (String word : allWords) {
			if (Q3.reverse(word).equalsIgnoreCase(word)) {
				palindromes.add(word);
			}
		}
		
		return palindromes;
		
	}
	
	
	
	
	

}
