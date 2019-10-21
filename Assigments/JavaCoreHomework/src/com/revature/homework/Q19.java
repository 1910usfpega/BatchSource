package com.revature.homework;

import java.util.List;

public class Q19 {
	
	public static void ArrayFun(List<Integer> nums ) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int even = 0, odd = 0;
		boolean isPrime = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				even += arr[i];
			else
				odd += arr[i];
			
			isPrime = checkPrime(nums.get(i));
				if(isPrime) {
					nums.remove(i);
				}
		}
		System.out.println("Even numbers sum " + even);
		System.out.println("Odd numbers sum " + odd);
		System.out.println(nums);
		
		
	}

	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
