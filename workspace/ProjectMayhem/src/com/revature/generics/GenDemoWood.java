package com.revature.generics;

public class GenDemoWood {

	public static void main(String[] args) {
//Create a GenWood Reference for integers
		GenWood<Integer> i;
		i = new GenWood<Integer>(88);
		i.showType();
//		get the value of i
		int v= i.getOb();
		System.out.println("value: "+v);
		GenWood<String> s = new GenWood<String>("Generics Test");
		s.showType();
		String str= s.getOb();
		System.out.println("value: "+str);
		
	}

}
