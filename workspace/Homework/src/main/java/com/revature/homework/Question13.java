package com.revature.homework;

/******************************************************************************
 * Q13. Display the triangle on the console as follows using any type of loop.
 * Do NOT use a simple group of print statements to accomplish this.
 * 
 * 0 1 0 1 0 1 0 1 0 1
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/

public class Question13 {

	public String[][] printTriangle() {
		boolean isOne = false;
		String[][] display = new String[4][4];
		
		for (int i = 0; i < 4; i++) 
			for (int j = 0; j < 4; j++) 
				display[i][j] = " ";
				
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				display[i][j] = "";
				if (j <= i) {
					if (!isOne) {
						display[i][j] = "0";
						isOne = !isOne;
					} else {
						display[i][j] = "1";
						isOne = !isOne;
					}
				} else {
					
//					System.out.print("\n");
					break;
				}
			}
		}
		return display;
	}
}
