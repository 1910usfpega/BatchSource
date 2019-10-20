package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Q13. Display the triangle on the console as follows using any type of loop.
 * Do NOT use a simple group of print statements to accomplish this.
 * 
 * 0 1 0 1 0 1 0 1 0 1
 * 
 * @author Bryan Wood
 *
 */
class Question13Test {

	@Test
	void test() {
		Question13 q = new Question13();
		String[][] result = q.printTriangle();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
