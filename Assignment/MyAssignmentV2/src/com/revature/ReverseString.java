package com.revature;

public class ReverseString {

	public String reverseString() {
		String str = "hello";
		System.out.println("Original String: "+ "\n"+str);
		String interChange = "";  
		
        for(int i1 = str.length() - 1; i1 >= 0; i1--)
        {
        	interChange = interChange + str.charAt(i1);
        }
        System.out.println("Reversed string is:");
        System.out.println(interChange);
		return interChange;
	}
}
