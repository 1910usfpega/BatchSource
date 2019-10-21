package com.revature.homework;
public class Question2 {
	public static void fibonacci() {
	int e1= 0;
	int e2= 1;
	System.out.println(e1+" "+e2);
	for (int i =2; i < 26; i++) {
		int e3=e1+e2;
		System.out.println(" "+e3); 
		e1=e2;
		e2=e3;
	
	}
}
}