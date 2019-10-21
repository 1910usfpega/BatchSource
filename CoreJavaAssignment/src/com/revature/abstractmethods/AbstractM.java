package com.revature.abstractmethods;

public class AbstractM extends AbstractMethods {

	AbstractM() {

	}
	

	@Override
	public boolean uppercase(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.toUpperCase().charAt(i)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String turnUpper(String s) {
		return s.toUpperCase();
	}

	@Override
	public int changeInt(String s) {
		int n = Integer.parseInt(s);
		return n;
	}

	public static void main(String[] args) {

		AbstractM abbs = new AbstractM();
		String first = "hi";
		String second = "hEllO";
		String third = "3"; 
		
		if (abbs.uppercase(first)) {
			System.out.println("Uppercase was found.");
		}else {System.out.println("No Uppercase found.");
		}
		if (abbs.uppercase(second)) {
			System.out.println("Uppercase was found.");
		}else {System.out.println("No Uppercase found.");
		}
		
		String newF = abbs.turnUpper(first);
		System.out.println("String all uppercase: " + newF);
		
		int t = abbs.changeInt(third);
		System.out.println("New integer is: "+ t);
		
	}

}
