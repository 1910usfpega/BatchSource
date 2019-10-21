//Write a program to store numbers from 1 to 100 in an array. 
//Print out all the even numbers from the array. Use the enhanced FOR loop for printing out the numbers.

package assignments;

import java.util.ArrayList;

public class ProblemTwelve {
	
	public static void printEven() {
		
		//Create an array list
		ArrayList<Integer> num = new ArrayList<>();
		
		//put num 1 to 100 into the array
		for (int i = 1; i < 101; i++) {
			num.add(i);
		}
		//print out even numbers
		System.out.print("Even Numbers: ");
		for(int j: num) { //go through the array list
			if(num.get(j-1)%2 == 0)
				System.out.print(num.get(j-1) + " ");
		}
		
	}
}
