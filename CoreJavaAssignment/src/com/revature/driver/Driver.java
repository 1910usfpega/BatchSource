package com.revature.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.revature.questions.*;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		System.out.println("Q1:");
		int[] a= {1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Unsorted array: "+ Arrays.toString(a));
		int[] aSorted=Q1.bubbleSort(a);
		System.out.println("Unsorted array: "+Arrays.toString(aSorted));
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q2:");
		System.out.println("Fibonacci numbers:");
		Q2.printFib(25);
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q3:");
		String myString="hey guys";
		System.out.println("Given string: "+ myString);
		String newString = Q3.reverse(myString);
		System.out.println("Reversed string: "+newString);
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q4:");
		Scanner s =new Scanner(System.in);
		System.out.println("Preparing to compute N!, what is N?");
		String response = s.nextLine();;
//		while(s.hasNextLine()){
//			response = s.nextLine();
//		}
		int n=Integer.parseInt(response);
		//s.close();
		int answer = Q4.computeFactorial(n);
		System.out.println(n+"! = "+answer);
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q5:");
		String wholeString="hello everybody i'm doing well";
		int howMany=9;
		System.out.println("Starting string: "+ wholeString);
		String subStr = Q5.subString(wholeString,howMany);
		System.out.println("Substring of the first "+howMany+" letters: "+ subStr);
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q6:");
		//s =new Scanner(System.in);
		System.out.println("What number do you want me to check?");
		String newResponse=s.nextLine();
//		while(s.hasNextLine()){
//			newResponse = s.nextLine();
//		}
		//s.close();
		System.out.println(newResponse);
		int myNumber=Integer.parseInt(newResponse);
		Q6.checkIfEven(myNumber);
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Q7:");
		Q7.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q8:");
		Q8.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q9:");
		Q9.main(args);
		
		System.out.println("-------------------------------------------");
		System.out.println("Q10:");
		Q10.main(s);
		
		System.out.println("-------------------------------------------");
		System.out.println("Q11:");
		Q11.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q12:");
		Q12.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q13:");
		Q13.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q14:");
		Q14.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q15:");
		Q15.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q16:");
		Q16.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q17:");
		Q17.main(s);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q18:");
		Q18.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q19:");
		Q19.main(args);

		
		System.out.println("-------------------------------------------");
		System.out.println("Q20:");
		Q20.main(args);
		
		
	}
	
	

}
