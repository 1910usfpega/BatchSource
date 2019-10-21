package com.revature.q18;

public class Q18Driver {
	public static void main(String[] args) {
		Q18SubClass q18 = new Q18SubClass();
		String entry = "hello world";
		q18.checkCase(entry);
		q18.superCase(entry);
		
		String intEntry = "150";
		q18.add10(intEntry);
	}

}
