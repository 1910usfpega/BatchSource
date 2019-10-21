package utils;

public class ReversString {
	
	
	public static void start(String stringToRevers) {
		System.out.println("String to revers: " + stringToRevers);
		System.out.println("Reversed:         " + ReversString.reversingString(stringToRevers));	
		
	}
	
	
	// Func reversing string without new Variable and return reversed string 
	public static String reversingString(String str) {
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(1, str.length() - i)
		        + str.substring(0, 1)
		        + str.substring(str.length() - i, str.length());
		 }
		return str;
	}

}
