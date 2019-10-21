//Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.

package assignments;

public class ProblemTwo {
	
	public static void fSequence(int x) {
		
		//Initializing variables to hold three values for the Fibonacci series (previous, current, and next value)
		int nextNum = 0;
		int prevNum = 0;
		int currentNum = 1;
		
		System.out.print("First 25 Fibonacci Sequence: ");
		//Looping 25 times
		for(int i = 0; i < 26; i++) {
			//Print out the first value
			if(i == 0)
				System.out.print(i + " ");
			//Print out second value
			else if(i == 1)
				 System.out.print(i + " ");
			
			//Start giving the variables the values
			else {
				nextNum = currentNum + prevNum;
				prevNum = currentNum;
				currentNum = nextNum;
				System.out.print(nextNum + " ");
			}
			
		}
	}
}
