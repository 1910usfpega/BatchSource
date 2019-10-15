package com.example.strings;

public class MyClass {
	public static void main(String[] args) {
		String name = "Roman";
		System.out.println(name);
		//returns a character at a specified index
		System.out.println(name.charAt(1));
		//returns an index of the first occurrence of character
		System.out.println(name.indexOf('o'));
		String s = "bananas";
		//looking for a string 'nan'
		//	name.

		/*
		 * Strings are immutable
		 * String builder - mutable
		 * StringBuffer - mutable and thread-safe
		 */
		String s5 = "Hey, guyz";
		StringBuilder sOne = new StringBuilder(s5);
		sOne.append(" and happy Tuesday.");
		System.out.println(sOne);
		
		String s7 = "Food Friday";
		StringBuffer sBuffer = new StringBuffer(s7);
		System.out.println(sBuffer);
		
	}
	
	
	
	
}