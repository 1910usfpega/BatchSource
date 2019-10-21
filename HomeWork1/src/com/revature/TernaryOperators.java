package com.revature;

import java.util.Scanner;

public class TernaryOperators {


	        static int ternary(){
	            int number1;
	            int number2;
	            int result;
	            int temp;
	            Scanner in = new Scanner(System.in);
	            System.out.println("Enter the first number: ");
	            number1 = in.nextInt();
	            System.out.println("Enter the second number: ");
	            number2 = in.nextInt();
	            temp = number1<number2 ? number1:number2;
	            result = number2<temp ? number2:temp;
	            System.out.println("Smallest number:"+ result);
	       return result;
	            
	        }
	

}
