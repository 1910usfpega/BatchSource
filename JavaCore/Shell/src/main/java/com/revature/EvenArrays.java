package com.revature;

import java.util.ArrayList;

public class EvenArrays {
	public static void Even() {
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i <= 100; i++)
		{numbers.add(i);}
		//Even = numbers.get(i) 
		for (int i: numbers)
		{
			if (numbers.get(i) % 2 == 0)
			{System.out.println(numbers.get(i));}
		}
	}
}
