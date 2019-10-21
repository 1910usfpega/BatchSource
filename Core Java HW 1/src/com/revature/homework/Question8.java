package com.revature.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Question8 {
	public static String temp;

	public static void ListHw(String str) {

		ArrayList<String> words = new ArrayList<>();
		{
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
		};

		ArrayList<String> words2 = new ArrayList<>();
		System.out.println("Question 8");
		
		System.out.println(words);
		System.out.println("List of words");
		ListIterator<String> iterator = words.listIterator();
		
		while (iterator.hasNext()){
			temp = (iterator.next());
			StringBuilder word2=new StringBuilder();
			if (word2.reverse().toString().equals(temp)) {
				words2.add(temp);
				System.out.println(temp);
			}
			
			
		}
		System.out.println("List of Palendromes");
		System.out.println(words2);
	}
}

