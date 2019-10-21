package com.revature.homework;

public class Question6 {
	
	

	public static boolean Even(int b) {
		String j = "Even";
		String z = "Odd";
		System.out.print("\nQuestion 6");
		for(int i = b; i>0;i++) {
			
			
			b=b-2;
			
			if(b==2) {System.out.println(j);return true;}
			else if (b==1) {System.out.println(z);}
			
	
		}
		return false;

	}

	
	
	}


