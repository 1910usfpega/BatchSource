package com.revature.homework;

public class Question10 {
public static void tren(){
	int i1= 22;
	int i2= 37;
	int output;
	int bucket;
	System.out.println("Numbers to be separated through ternary operation: "+i1+", "+i2);
	bucket = i1<i2 ? i1:i2;
	output = i2<bucket ? i2:bucket;
	System.out.println("Smallest number: "+output);
	
}
}
