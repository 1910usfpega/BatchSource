package com.revature.flows;

import com.revature.bean.Person;

public class LoopyLoop {
	public static void ifStatement(int a) {
		if (a>5) {
			System.out.println("Bigger that 5");
		} else if (a==5) {
			System.out.println("a is 5");
		} else{
			System.out.println("Smaller than 5");
		}
	}
	
	// Switch statement
	
	public static void whatColor(String color) {
		switch (color) {
		case "green":
			System.out.println("Hulk");
			break; // break out of loop
		case "purple":
			System.out.println("Thanos");
			break;
		case "crimson":
			System.out.println("Roll Tide");
			break;
		default:
			System.out.println("You are a trrible human being");
			break;
		}
	}
	
	// For loop 
	public static void forLoopFunness(int p) {
		for (int i=p; i>0; i--) {
			if (i==10 || i==14) {
				// break;
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	static int [] myArray = {11, 23, 43, 56, 67, 67, 89};
	public static void forEachFun(int [] a) {
		for (int x:a) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
//		ifStatement(1);
//		whatColor("pink");
//		forLoopFunness(15);
//		forEachFun(myArray);
		
		Person p = new Person("Lucy", 45, 773);
		String t="dog";
		System.out.println(p.equals(new Person("Lucy", 45, 773)));
	}
}
