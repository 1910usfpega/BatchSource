	//Create an ArrayList and insert integers 1 through 10. Display the ArrayList. \
//Add all the even numbers up and display the result. Add all the odd numbers up and display the result. 
//Remove the prime numbers from the ArrayList and print out the remaining ArrayList.

package assignments;

import java.util.ArrayList;

public class ProblemNineteen {
	public static int even = 0;
	public static int odd = 0;

	public static void display() {

		ArrayList<Integer> myNum = new ArrayList<>();

		// Incrementing from 1 to 10
		for (int i = 1; i < 11; i++) {
			myNum.add(i);
			if (i % 2 == 0)
				even = even + myNum.get(i - 1); // if the number is even, add it
			else
				odd = odd + myNum.get(i - 1); // if the number is odd add it
		}

		// Display the array list from 1 to 10 and printing out the added even and odd
		// numbers
		System.out.print(myNum);
		System.out.print("\nAdded Even: " + even);
		System.out.print("\nAdded Odd: " + odd + "\n");
		for (int j = 1; j < 11; j++) {
			if (myNum.indexOf(j) != 7)
				if (myNum.indexOf(j) != 5)
					if (myNum.indexOf(j) != 3)
						if (myNum.indexOf(j) != 2)
							System.out.print(myNum.indexOf(j) + " ");
		}
	}
}
