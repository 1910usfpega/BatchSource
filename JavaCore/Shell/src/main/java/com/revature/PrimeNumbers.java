package com.revature;

import java.util.ArrayList;

public class PrimeNumbers {
	public static void Prime() {
		//arraylist
		//double for loop
		ArrayList<Integer> numbers = new ArrayList<>();
		//ArrayList<Integer> PrimeNumbers = new ArrayList<>();
		boolean prime = true;
		for(int i = 1; i <= 100; i++)
		{numbers.add(i);}
		for(int i = 1; i <= 100; i++)
		{
			int f = 1;
			for(int j = 1; j < i; j++) {
				//System.out.println(j);
				//System.out.println(i);
				if(i%j == 0 && j != 1 && i/j != 1 )
				{
					prime = false;
					break;}
			}
			if (prime == true)
			{System.out.println(numbers.get(i));}
		}
		
	}
}
