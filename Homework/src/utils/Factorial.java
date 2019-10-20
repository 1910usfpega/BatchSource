package utils;

public class Factorial {
	public static Integer factorial(Integer input) {
		if (input == 0) {
			return 1;
		} else {
			return (input * factorial(input-1));
		}
	}
	
	public static void start(Integer n) {
		System.out.println("Factorial of " + n + " is: " + factorial(n));
	}
}
