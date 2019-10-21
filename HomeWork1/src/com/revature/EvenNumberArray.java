package com.revature;

public class EvenNumberArray {
	
		public int[] evenNumber() {
			int [] aaa = new int[50];
	        int[] array = new int[101];

	        for (int i = 0; i < array.length; i++) {
	        	array[i] = i;
	        }
	        
	      
	        int i = 0;
	        for (int x : array) {
	        	if(x == 0) {}
	        else if (x % 2 == 0 ) {
	        	System.out.print(x + ", ");
	            aaa[i] = x;
	            i++;
	            }
	        }
	        return aaa;
	    }
	

}
