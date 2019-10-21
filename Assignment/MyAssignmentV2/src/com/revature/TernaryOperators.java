package com.revature;

import java.util.Scanner;

public class TernaryOperators {


	        static int ternary(){
	            int num1;
	            int num2;
	            int result;
	            int temp;
	            Scanner in = new Scanner(System.in);
	            System.out.println("Enter the first number: ");
	            num1 = in.nextInt();
	            System.out.println("Enter the second number: ");
	            num2 = in.nextInt();
	            

	            temp = num1<num2 ? num1:num2;
	            result = num2<temp ? num2:temp;
	            System.out.println("Smallest number is:"+result);
	            return result;
	            
	        }
	

}
