package com.john;

import java.util.ArrayList;

public class Q12EnhancedEvenNumberLoop {

//	ArrayList<Integer> evn = new ArrayList<Integer>();
	public static void evenExtraction() {
		int[] evNumArr = new int[100];
		for (int add = 0; add != 100; add++) {
			evNumArr[add] = add + 1;
		}

		for (int i : evNumArr) {
			int num = i;
			if (i % 2 == 0) {
				System.out.println(num);
			}
		}

	}

}
