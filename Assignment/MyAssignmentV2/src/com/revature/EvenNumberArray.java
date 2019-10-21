package com.revature;

public class EvenNumberArray {
	
		public static int[] evenNumber() {
			
			int [] array1 = new int[50];
	        int[] myArray = new int[101];

	        for (int i = 0; i < myArray.length; i++) {
	            myArray[i] = i;
	        }

	       int i = 0;
	        for (int x:array1) {
	           if(x==0) {
	        	   
	           }else if(x % 2 == 0) {
	        	   System.out.println(x + ",");
	        	   array1[i]= x;
	        	   i++;
	           }
	        }
	        return array1;
	    }
	

}
