package com.revature;

import java.util.ArrayList;

public class EvensOddsPrime {
	public static void Arrayz() {
		ArrayList<Integer> numbers = new ArrayList<>();
		int odds = 0, evens = 0;
		boolean isPrime = false;
		
		for(int i = 0; i <= 10; i++)
		{numbers.add(i);}
		for (int i: numbers)
		{
			if (numbers.get(i) % 2 == 0 && i != 0)
			{evens += numbers.get(i);}
		}
		System.out.println(evens);
		for (int i: numbers)
		{
			if (numbers.get(i) % 2 != 0 && i != 0)
			{odds += numbers.get(i);}
		}
		System.out.println(odds);
		for(int i = 0; i <= 10; i++)
		{
			if( i == 2 || i == 3 || i == 5 || i == 7)
				{numbers.remove(i);}
			if( i == 3)
			{numbers.remove(i);}
		}
		System.out.println(numbers);
	}
}
