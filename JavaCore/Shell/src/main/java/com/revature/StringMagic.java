package com.revature;

public class StringMagic {
	public static void MagicalString() {
	String stringMagic = "Cat";
	String stringMagic2 = "";
	
	for (int i = stringMagic.length()-1; i >= 0; i--) {
		stringMagic2 += stringMagic.charAt(i);
	}
	System.out.println(stringMagic2);
	}
}
