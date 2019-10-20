package com.revature.q18;

public class Driver {
	public static DemoSubClass dsc = new DemoSubClass();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Lowercase";
		String s2 = "uppercase";
		String number = "10";
		String wrongNumber = "10A";
		
		
		
		System.out.println("Is uppercase characters in the string \"" +s1 + "\": " + dsc.isUppercaseCharactersInTheString(s1));
		System.out.println("Is uppercase characters in the string \"" +s2 + "\": " + dsc.isUppercaseCharactersInTheString(s2));
		
		System.out.println();
		
		System.out.println("Convert string \""+s1+"\" to uppercase: "+dsc.convertToUppercase(s1));
		
		System.out.println();
		converToInt(number);
		converToInt(wrongNumber);
		
		

	}
	
	public static void converToInt(String number) {
		try {
			int a = dsc.convertStringToInteger(number);
			System.out.println("Convert string \""+number+"\" to integer: " + a);
		} catch (Exception e) {
			System.out.println("Can't convert string \""+number+"\" to integer");
			// TODO: handle exception
		}	
	}

}
