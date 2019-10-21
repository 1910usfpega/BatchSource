package com.revature.questions;

public class Q16 {

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
