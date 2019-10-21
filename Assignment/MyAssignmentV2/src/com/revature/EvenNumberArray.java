package com.revature;

public class EvenNumberArray {
	
		public static int evenNumber() {
	        for (int i = 0; i <= 100; i++) {
	            System.out.print(i);
	        }

	        int[] myArray = new int[101];

	        for (int i = 0; i < myArray.length; i++) {
	            myArray[i] = i;
	        }


	        for (int x : myArray) {
	            if (x % 2 == 0 && x != 0) System.out.print(x + ", ");
	        }
	        return 0;
	    }
	

}
