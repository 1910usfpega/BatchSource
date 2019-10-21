package com.john;

public class Q6EvenNumbers {
	
	public static int itsEven(int num) {
		 
		while (num != 0) {
			num -= 2;
			if (num < 0) {
				System.out.println("Not even");
				return -1;
				
			}else if(num == 0) {
				System.out.println("It is an even number");
				return 0;	
			}
		}
		return num;
	}



//clould make this more efficient by taking each number and putting it into an index.
//then just run a condition that checks only the last element in the array
//the last step would see if the number would equal 0 through the divsion of 2

//	public static boolean inspiredEvenMethod(int num) {
		//ternary operator 
		// take num / 2
		// num * 2
		// if num = num
		// then its even
		// if it is short by one then odd
		//integers are weird
//	}
}