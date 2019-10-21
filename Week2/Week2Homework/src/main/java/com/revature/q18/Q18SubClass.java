package com.revature.q18;


public class Q18SubClass extends Q18SuperClass {
	@Override
	boolean checkCase(String entry) {
		for(int i=0;i<entry.length();i++) {
			char c = entry.charAt(i);
			if(entry.charAt(i)* 1 == entry.charAt(i)) continue;//this number is a next item
			if(entry.charAt(i)== entry.toUpperCase().charAt(i)) return false;
		}
		return true;
	}

	@Override
	String superCase(String entry) {
		return entry.toUpperCase();
	
	}

	@Override
	int add10(String entry) {
		
		try {
		return Integer.parseInt(entry)+10;
	}catch(NumberFormatException nfe) {
		System.out.println("this is not a number!");
	}
       return 0;
}
}

