package com.revature.generics;

public class GenDemo {

	public static void main(String[] args) {
		//create a Gen1 reference for Integers
		Gen1<Integer> i;
		i = new Gen1<Integer>(88);
		i.showType();
		//get the value of i
		int v = i.getob();
		System.out.println("value: " + v);
		
		Gen1<String> s = new Gen1<String>("Generics Test");
		s.showType();
		String str = s.getob();
		System.out.println("value: " + str);
	}

}
