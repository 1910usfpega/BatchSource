package com.revature.palinidrome;

import java.util.ArrayList;
import java.util.Scanner;

public class Palinidrome {
	
	public static void main(String[] args) {
		ArrayList<String> all = new ArrayList<String>();
		ArrayList<String> just_palindromes = new ArrayList<String>();
		
		all.add("karan");
		all.add("madam");
		all.add("tom");
		all.add("civic");
		all.add("civic");
		all.add("radar");
		all.add("jimmy");
		all.add("kayak");
		all.add("john");
		all.add("refer");
		all.add("billy");
		all.add("did");
		
		for(String word : all) {
			if(is_palindrome(word)) {
				just_palindromes.add(word);
			}
		}
		
		for (String word : just_palindromes) {
			System.out.println(word);
		}
	}
		
	public static boolean is_palindrome (String original) {
		String reverse = "";
	
		for( int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if (reverse == original) {
			return true;
		}
		else {
			return false;
		}
	}
}
