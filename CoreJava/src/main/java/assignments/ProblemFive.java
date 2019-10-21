//Write a substring method that accepts a string str and an integer idx and returns the substring contained between 0 
//and idx-1 inclusive.  Do NOT use any of the existing substring methods in the String, 
//StringBuilder, or StringBuffer APIs.

package assignments;

import java.util.Arrays;

public class ProblemFive {

	static char[] cToString;
	static String newString;
	
	//Passing in a string and integer as an index
	public static String sString(String str, int idx) {
		
		//Turning the string into a character array
		char[] charString = str.toCharArray();

		//if the index is in range of the length, grab the substring
		if (idx > 0 && idx < str.length()) {
			cToString = Arrays.copyOfRange(charString, 0, idx);
			newString = new String(cToString);
		}
		
		//If the index is more than the length or is under 0, it is out of bound; return null
		if (idx < 0 || idx > (str.length() - 1)) {
			System.out.println("The index is out of bound");
			return null;
		} else
			return newString;
	}
}
