package com.revature.bean;

public class DoStringManipulation extends ManipulateString{
	
	/*
	 * Q18. Write a program having a concrete ;subclass that inherits three abstract methods from a superclass.  
	 * Provide the following three implementations in 
		the subclass corresponding to the abstract methods in the superclass:
 
		1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if any are found.	
		2. Convert all of the lower case characters to uppercase in the input string, and return the result.
		3. Convert the input string to integer and add 10, output the result to the console.
		Create an appropriate class having a main method to test the above setup.
	 * 
	 * */

	@Override
	public boolean upperCase(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)) ) {
				return true;
			} 
		}
		
		return false;
	}

	@Override
	public String toLowerCase(String s) {return s.toUpperCase();}

	@Override
	public void toInt(String s) {
		
		int result = Integer.parseInt(s) +10;
		
		System.out.println("New value is :" + result);
		
	}
	
	

}
