package com.revature.homework;

public abstract class Q18 {
	
	public abstract void methods1(); {
		
		String str = "JAVA IS GOING PLACES";
		
		System.out.println( "Is String uppercase?; "+ isStringUpperCase(str) );
	}
	
	public static boolean isStringUpperCase(String str) {
		
		char[] charArray = str.toCharArray();
		
		for(int i=0; i < charArray.length; i++) {
			if( !Character.isUpperCase( charArray[i])) {
				return false;
			}
		
		}
		return true;
	}
	public abstract void methods2();{
		String str = new String("java is the best");
		System.out.println(str.toUpperCase());
	}
	public abstract void methods3();{
		String number = "10";
		Integer result = Integer.valueOf(number);
		System.out.println(result);
	}
}
