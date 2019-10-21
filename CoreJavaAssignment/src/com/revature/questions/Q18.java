package com.revature.questions;

import com.revature.differentpackage.Abstr;

public class Q18 extends Abstr{
	/*
	 * This class extends an abstract class, defines the functions and prints from 3 different methods
	 *  
	 */

	public static void main(String[] args) {
		Q18 q= new Q18();
		String st="hmMmmmm";
		System.out.println(st);
		System.out.println("Has uppercase letters is "+q.hasUpper(st));
		System.out.println("After converting to uppercase: "+q.makeUpper(st));
		String str="10";
		System.out.println("New string = "+str);
		int converted = Integer.parseInt(str);
		System.out.println("Converted and added = "+converted);

	}
	
	public Q18() {
		/*
		 * This is only here because the abstract methods could not be static, so
		 * in order to run the methods contained here it must be constructed
		 */
		
	}

	@Override
	public boolean hasUpper(String s) {
		/*
		 * Returns true if there is an upper case letter.
		 */
		if(s.toLowerCase().equals(s)){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String makeUpper(String s) {
		return s.toUpperCase();
	}

	@Override
	public int convert(String s) {
		return Integer.parseInt(s)+10;
	}

}
