package com.example.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> hSet = new HashSet<>();
		
		hSet.add(4);
		hSet.add(5);
		hSet.add(6);
		hSet.add(7);
		hSet.add(8);
		hSet.add(9);
		
		Set<Integer> tSet = new TreeSet<>();
		
		tSet.addAll(hSet);
		
		System.out.println(hSet);
		

	}

}
