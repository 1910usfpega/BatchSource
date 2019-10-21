package com.revature.homework;

import com.revature.bean.Child;

/******************************************************************************
 * Q18. Write a program having a concrete ;subclass that inherits three 
 *  	 abstract methods from a superclass.  Provide the following three 
 *  	 implementations in the subclass corresponding to the abstract methods 
 *  	 in the superclass:
 *  
 *  1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ 
 *  	depending if any are found.	
 *  2. Convert all of the lower case characters to uppercase in the input 
 *  	string, and return the result.
 *  3. Convert the input string to integer and add 10, output the result to the 
 *  	console.
 *  
 *  Create an appropriate class having a main method to test the above setup.
 *  
 * @author Bryan Wood
 *
 *****************************************************************************/


public class Question18 {
public static void main(String[] args) {
	Child c = new Child();
	String test = "FASLLDKjaokojkl;OSDIFQOERIFRJ";
	
	System.out.println("Testing if the string : "+test
			+" has any upper case letters.\n");
	System.out.println(c.hasUpperCase(test)+"\n");
	System.out.println("Convert "+test+" to lower case, no caps allowed!\n");
	System.out.println(c.toLowerCase(test)+"\n");
	System.out.println("And now for something completely different!\n");
	System.out.println(c.doesStrangeThing(test)+"\n");
}
}
