package com.revature.homework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q8 {
	public static String temp;

	public static String List() {
		ArrayList<String> words = new ArrayList<>();
		words.add("karan");
		words.add("madam");
		words.add("tom");
		words.add("civic");
		words.add("radar");
		words.add("jimmy");
		words.add("kayak");
		words.add("john");
		words.add("refer");
		words.add("billy");
		words.add("did");
		
	
		System.out.println("Non Palindrome List");
		System.out.println(words);	
		System.out.println("=======================");
	
		ArrayList<String> words2 = new ArrayList<>();
		
		ListIterator<String> iterator = words.listIterator();
		
		while (iterator.hasNext()) {
			temp = (iterator.next());
			StringBuilder word2=new StringBuilder(temp);
			if(word2.reverse().toString().equals(temp)) {
				words2.add(temp);
				System.out.println(temp);
			}
			System.out.println("Palindrome List");
			System.out.println(words2);
		}
		
		
	return "Palindrome";}
	
	

}
