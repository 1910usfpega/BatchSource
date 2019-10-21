package com.revature.q18;

public class Abstraction extends AbstractionMethods{
	
	{System.out.println("Q18");}

	@Override
	public boolean hasCaps(String s) {
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >='A' && s.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	}

	@Override
	public String lowerCaps(String s) {
		
		return s.toLowerCase();
	}

	@Override
	public void stringToInt(String s) {
		System.out.println(10 + Integer.parseInt(s));
		
		
	}

}
