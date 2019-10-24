package com.revature.reverse;

import java.util.Arrays;

/*Reverse a string without using a temporary variable.  
 * Do NOT use reverse() in the StringBuffer or the StringBuilder APIs
 */
public class Reverse {
	
	public static void reverse() {
		
		String name = "CHUPACABRA";
		String reverse = "";
		
		for (int i=name.length();i>0;--i) {
			reverse=reverse+(name.charAt(i-1));	
		}
		System.out.println(reverse); 		
	
	}	
}
<<<<<<< HEAD


=======
>>>>>>> origin/NarrainenS
