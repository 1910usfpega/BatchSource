package com.john;

public class Q18ConcreteSubClass extends Q18AbstractClass {

	public boolean checkUpper(String word) {

		String[] t = word.split("");

		for (String i : t) {

			if (i.equals(i.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	
	public String convertLower(String word) {
		return word.toLowerCase();
	}

	
	public int string2Int(String word) {
		int outcome = 10;
		for (int i = 0; i < word.length(); i++) {
			outcome += (int) word.charAt(i);
			
		}
		return outcome;
	}

}
