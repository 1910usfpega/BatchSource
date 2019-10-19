package com.revature.tests;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String name;
		int testing;
		
		Set<Integer> set= new HashSet<>();
		
		set.add(4);
		set.add(6);
		set.add(12);
		set.add(88);
		set.add(58);
		
		System.out.println(set.contains("88"));
		
		//System.out.println(s);

	}

}
