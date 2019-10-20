package com.revature.homework;

import java.util.ArrayList;

/******************************************************************************
 * Q19. Create an ArrayList and insert integers 1 through 10. Display the 
 *  		ArrayList. Add all the even numbers up and display the result. Add 
 *  		all the odd numbers up and display the result.
 *  
 * 		 Remove the prime numbers from the ArrayList and print out the remaining 
 *  		ArrayList.
 * @author Bryan Wood
 *
 *****************************************************************************/


public class Question19 {
	
	public void arrayListStuff() {
		int even=0;
		int odd=0;
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i=0;i<10;i++) 
			n.add(i+1);
		System.out.println("My array list starts like this: ");
		for(int i=0;i<n.size();i++)
			System.out.print(n.get(i)+"\t");
		System.out.println();
		for(int i:n) {
			if(i%2==0) {even+=i;} else {odd+=i;}
		}
		System.out.println("The sum of even numbers is: "+even+"\n"
				+"The sum of odd numbers in my arraylist is: "+odd);
		n.remove(1);n.remove(1);n.remove(2);n.remove(3);
		
		System.out.println("All non-prime numbers in my arraylist are: ");
		for(int i:n)
			System.out.print(i+"\t");
		
		
	}

}
