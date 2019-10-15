package com.example.strings;

import java.io.PrintStream;

public class MyClass {
	private static PrintStream sBuilderOne;

	public static void main(String[] lemonPie) {
		
		String name = "Roman";
		System.out.println(name);
		
		
		System.out.println(name.charAt(1));
		
		//returns an index of the first occurrence of character "o"
		System.out.println(name.indexOf("o"));
		
		//find a substring 
		String s = "bananas";
		//looking for a string "nan"
		System.out.println(s.contains("nan"));
		
		//comparing strings
		String s2 = "apples";
		System.out.println(s.compareTo(s2));
		
		String s3 = new String("bananas");
		
		
		//equals compares the actual value 
		if (s.equals(s3)) {
			System.out.println("boyakasha");//??????
		}
		
		/*
		 * Strings are immutable 
		 * StringBuilder - mutable 
		 * StringBuffer - mutable and thread safe 
		 */
		String s5 = "Hey, Guys";
		StringBuilder sBuilderOne = new StringBuilder(s5);
		sBuilderOne.append("and happy Tuesday");
		System.out.println(sBuilderOne);
		
		String s6= "Whynot?";
		String s7 = s6.concat("let us out early... or else");
		System.out.println(s7);//the pointer create a new string literal 
		
		String s8 = "Food Friday";
		StringBuffer sBufferOne = new StringBuffer(s7);
		sBufferOne.append(" and drinks Saturday");
		System.out.println(sBufferOne); 
		
		
		/*
		 * Exception : a problem internal to my program 
		 * Error : a problem external to my program. Fatal: 
		 * 
		 * Runtime/Checked Exceptions:     
		 * 
		 * Compile Time/Checked exceptions:
		 * 
		 *  			Throwable Class  
		 *  Errors                          Exception 
		 *  								RunTime Exception 
		 * 
		 * 
		 */
	}

}
