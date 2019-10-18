package com.example.stings;

public class MyClass {
	
	
	public static void main(String [] args ) {
		String name = "Roman";
		System.out.println(name);
		
		// returns a character at specific index
		System.out.println(name.charAt(1));
		
		// returns an index of the first occurrence of character "o";
		System.out.println(name.indexOf("j"));
		
		// find a substring
		String s = "bananas";
		
		// looking for a string "nan"
		System.out.println(s.contains("nan"));
		
		
		// comparing strings
		String s2 = "bananas";
		String s3 = new String ("bananas");
		String s4 = "bananas";
		
		if (s==s4) {
			System.out.println("booyah");
		}
		
		if (s.equals(s3)) {
			System.out.println(".equals is awesome");
		}
		
		/* 
		 *  Sting are immutable.
		 *  StringBuilder - mutable
		 *  StringBuffer  - mutable and thread-safe
		 */
		
		String s5 = "Hey, guyz";
		StringBuilder sBuilderOne = new StringBuilder(s5);
		sBuilderOne.append(" and happy Tuesday");
		System.out.println(sBuilderOne);
		
		String s6 = "Why not?";
		String s7 = s6.concat(" let us out early... or else");
		System.out.println(s7); 
		
		String s8 = "Food Friday";
		StringBuffer sBufferOne = new StringBuffer(s8);
		sBufferOne.append(" and drinks Saturday");
		System.out.println(sBufferOne);
	}
}
