package com.example.strings;



public class MyClass {



	public static void main(String[] lemonPie) {

		

		String name = "Roman";

		//System.out.println(name);

		

		//returns a character at a specified index

		//System.out.println(name.charAt(1));

		

		//returns an index of the first occurance of character "o"

		//System.out.println(name.indexOf('o'));

		

		//find a substring

		String s = "bananas";

		//looking for a string "nan"

		//System.out.println(s.contains("tuesday"));

		

		//comparing strings

		String s2 = "bananas";

		//System.out.println(s.compareTo(s2));

		

		String s3 = new String("bananas");

		String s4 = "bananas";

		

		//== compares the memory address

		if(s==s4) {

			System.out.println("booyah");

		}

		

		//.equals compares the actual value

		if(s.equals(s3)) {

			System.out.println(".equals is awesome");

		}

		

		/*

		 * Strings are immutable.

		 * StringBuilder - mutable

		 * StringBuffer -  mutable and thread-safe

		 */

	

		String s5 = "Hey, guyz";

		StringBuilder sBuilderOne = new StringBuilder(s5);

		sBuilderOne.append(" and happy Tuesday");

		System.out.println(sBuilderOne);

		

		String s6 = "Why not?";

		s6 = s6.concat("let us out early... or else");

		System.out.println(s6);

		

		String s7 = "Food Friday";

		StringBuffer sBufferOne = new StringBuffer(s7);

		sBufferOne.append(" and drinks Saturday");

		System.out.println(sBufferOne);

		

	}

	



	

}

		

			



			

		

		


