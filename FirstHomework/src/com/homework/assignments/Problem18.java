package com.homework.assignments;

public class Problem18 extends ProblemEighteen {
	
	
	@Override
	public boolean upperCheck(String string) {
		int i = 0;
		boolean check = false;
		char[] c = string.toCharArray();

		//Checking to see if the ASCII value of each letter contains an uppercase letter
		while (i < (string.length())) {
			if (((int) c[i]) > 66 && (int) c[i] < 91) {
				check = true;
				return check;
			} else
				check = false;
			i++;
		}

		return check;
	}

	//Changing each letter to uppercase
	@Override
	public String allUpper(String string) {
		return string.toUpperCase();

	}
	
	//Converting a string to an integer and adding 10 to it
	@Override
	public int convert(String string) {
		int i;
		try {
			   i = Integer.parseInt(string);
			}
			catch (NumberFormatException e)
			{
			   i = 0;
			}
		return i;
	}

}
