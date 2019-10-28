package com.revature.homework;

public class Question6 {
	 public static String divisibility(int a) {
		 String e = "EVEN";
		 String o = "ODD";
		 for(int i = a; i>0;i++) {
			 a=a-2;
			 if(a==2) {return e;}
			 else if(a==1){return o;}
			// else if (a==0) {return "needs work";}
		 }
		 return " ";
	 }
}
