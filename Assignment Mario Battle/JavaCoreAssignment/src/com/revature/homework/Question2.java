package com.revature.homework;

public class Question2 {
 public static int fibonacci() {
	 int n1= 0;
	 int n2 = 1;
	 System.out.print(n1+" "+n2);
	 for(int i = 2; i < 26; i++) {
	int n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	 }
	 return 0;
 }

}
