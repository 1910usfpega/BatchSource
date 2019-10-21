package com.revature.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question19 {
	

	public static void RickFox(String str) {
		   
		Scanner s = new Scanner(System.in);
		    boolean status;
		    
		    System.out.println( "Question 19");
		    System.out.print("Enter size of array=");
		   
		    int size = s.nextInt();
		    int arr[] = new int[size];
		    int tmp[] = new int[size];
		    
		    System.out.println("Enter Elements in array...");
		    int primerCounter = 0;
		    for (int i=0; i < size; i++) {
		        arr[i] = s.nextInt();
		    }
		    for (int i=0; i < size; i++) {
		        status = true;
		        if (arr[i] == 0 || arr[i] == 1) {
		            status = false;
		        }
		        else {
		            for (int j=2; j <= arr[i]-1; j++) {
		                if (arr[i] % j ==0) {
		                    status = false;
		                    break;
		                }
		            }
		        }
		        if (status == true) {
		            tmp[primerCounter++] = arr[i];
		            System.out.println("Prime Number Found="+arr[i]);
		        }
		    }

		    System.out.println("New Array....");
		    for (int i=0; i < primerCounter; i++) {
		        System.out.println(tmp[i]);
		    }
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum = IntStream.of(a).sum();
		System.out.println("The sum of all numbers is " + sum);
		
			Scanner sc;
				int Size, i, EvenSum = 0, OddSum = 0;
				sc = new Scanner(System.in);
			 
				System.out.print(" Please Enter Number of elements in an array : ");
				Size = sc.nextInt();	
				
				int [] a1 = new int[Size];
				
				System.out.print(" Please Enter " + Size + " elements of an Array  : ");
				for (i = 0; i < Size; i++)
				{
					a1[i] = sc.nextInt();
				}   

				for(i = 0; i < Size; i++)
				{
					if(a1[i] % 2 == 0)
					{
						EvenSum = EvenSum + a1[i]; 
					}
					else
					{
						OddSum = OddSum + a1[i]; 
					}
				}		
				System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
				System.out.println(" The Sum of Odd Numbers in this Array = " + OddSum);
			}
}
	




	
	
		
		
		 