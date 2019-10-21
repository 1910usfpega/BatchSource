package com.revature.questions;

public class Q16 {
	/*
	 * This will take strings from the user and will return the length of the string
	 * It works when being run from the console and also when the main driver is run from the 
	 * console will pass the string to this class as well.
	 */

	public static int main(String[] args){

		if (args.length>0) {
	        System.out.println("The string is "+args[0].length()+" letters long");
	        return args[0].length();
		}else {
			System.out.println("No string was given.");
			return 0;
		}
    }

}
