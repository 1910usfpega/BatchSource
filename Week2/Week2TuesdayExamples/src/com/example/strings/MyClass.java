package com.example.strings;

public class MyClass {
	
	public static void main(String[] args) {
		String name = "Andy";
		//System.out.println(name);
		
		//returns a character at a specified index
		//System.out.println(name.charAt(1));
		
		//returns an index of the first occurance of character "o"
		//System.out.println(name.indexOf('o'));
		
		//find substring
		//System.out.println(name.contains("nan"));
		
		//comparing strings 
		String name2 = "ben";
		//System.out.println(name.compareTo(name2));
		
		String s5 = "hello world";
		StringBuilder sBuildONe = new StringBuilder(s5);
		
		sBuildONe.append(" happy tuesday");
		
		System.out.println(sBuildONe);
		
		
		String s7 = "food friday ";
		StringBuffer sBufferOne = new StringBuffer(s7);
		sBufferOne.append("and drinks");
		System.out.println(sBufferOne);
	}

}
