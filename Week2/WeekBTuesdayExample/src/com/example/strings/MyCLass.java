package com.example.strings;

public class MyCLass {

	public static void main(String[] args) {
		String name = "Roman";
		System.out.println(name);
		
		//returns a character at a specified index
		System.out.println(name.charAt(1));
		
		//returns an index of the first occurrence of character "o"
		System.out.println(name.indexOf('o'));
		
		//find a substring
		String s = "bananas";
		//look for a string "nan"
		System.out.println(s.contains("nan"));
		
		//comparing strings
		String s2 = "apples";
		System.out.println(s.compareTo(s2));
		
		String s3 = new String("bananas");
		String s4 = "bananas";
		
		//== compares the memory address
		if(s == s4) {
			System.out.println("booyah");
		}
		
		//.equals compares the actual value
		if(s.equals(s3)) {
			System.out.println(".equals is awesome");
		}
		
		//allows us to "mute" strings; faster
		String s5 = "Hey, guyz";
		StringBuilder sBuilderOne = new StringBuilder(s5);
		sBuilderOne.append(" and happy Tuesday");
		System.out.println(sBuilderOne);
		
		String s6 = "Why not?";
		s6 = s6.concat(" Let us out early... or else");
		System.out.println(s6);
		
		//allows us to "mute" strings; thread safe; slower
		String s7 = "Food Friday";
		StringBuffer sBufferOne = new StringBuffer(s7);
		sBufferOne.append(" and drinks Saturday");
		System.out.println(sBufferOne);
		
	}
	
	/*
	 * Strings are immutable.
	 * StringBuilder - mutable
	 * StringBuffer - mutable and thread-safe
	 */

	
}
