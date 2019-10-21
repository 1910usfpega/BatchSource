package com.revature.Fibbonacci;

public class Fibbonacci {
	int max = 25;
	int first = 0;
	int next = 1;
	
	for(int i = 0; i < max; i++) {
		int sum = first + next;
		System.out.println(first + " + " + next + " = " + sum);
		first = next;
		next = sum;
	}
}	
}
