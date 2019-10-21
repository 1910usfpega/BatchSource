package com.revature;

import java.util.ArrayList;

public class ArrayListPalindromes {
	
	public static void isPalindrome() {
		System.out.println("Q8");
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> p = new ArrayList<>();
		int count = 0;
		
		populate(list1);
		for(String s : list1) {
			for(int i=0; i<s.length()/2; i++) {
				if(s.charAt(i) == s.charAt(s.length()-(i+1))) {
					count++;
				}
			}
			if(count == s.length()/2) {p.add(s);}
			count = 0;
		}
		System.out.print("Palindromes: [ ");
		for(String s : p) {
			System.out.print(s + " ");
		}
		System.out.println("]\n");
	}
	
	public static void populate(ArrayList<String> li) {
		li.add("karan");
		li.add("madam");
		li.add("tom");
		li.add("civic");
		li.add("radar");
		li.add("jimmy");
		li.add("kayak");
		li.add("john");
		li.add("refer");
		li.add("billy");
		li.add("did");
	}
}
