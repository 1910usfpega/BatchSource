package com.revature;

import java.util.ArrayList;

public class Palindromes {
	public static void Tacocat() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("karan");
		names.add("madam");
		names.add("tom");
		names.add("civic");
		names.add("radar");
		names.add("jimmy");
		names.add("kayak");
		names.add("john");
		names.add("refer");
		names.add("billy");
		names.add("did");
		//names.get(i).length()-1;
		ArrayList<String> Palindrome = new ArrayList<String>();
		//int j = 0;
		/*
		 *  String Reverse for loop
		 * 
		 * 	for (int i = stringMagic.length()-1; i >= 0; i--) {
		 *	stringMagic2 += stringMagic.charAt(i);}
		 */
		String stringMagic = "";
		for (int j = 0; j < names.size(); j++)
		{
			for (int i = names.get(j).length()-1; i >= 0; i--) {
			
				//String stringMagic = "";
				stringMagic += names.get(j).charAt(i);
				//System.out.println(stringMagic);
				//System.out.println(names.get(j).length());
			}
		if(names.get(j).equals(stringMagic)) {
			Palindrome.add(names.get(j));
		}
		stringMagic = "";
		}
		System.out.println(Palindrome);
	}
}
