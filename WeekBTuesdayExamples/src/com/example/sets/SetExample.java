package com.example.sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		/*
		 * Sets
		 * Data structure inside the Collection API
		 * only allow for storage of Objects
		 * 
		 * To actually utilize primitive data types, we
		 * use Wrapper Class
		 * 
		 * int -> Integer
		 * boolean -> Boolean
		 * byte -> Byte
		 * 
		 * the process of converting a primitive data type into
		 * its Wra[[er class is called boxing (autoboxing)
		 * Wrapper -> primitive = unboxing
		 * 
		 */
		
		Set<Integer> hSet = new HashSet<>();
		hSet.add(5);
		hSet.add(7);
		hSet.add(8);
		hSet.add(9);
		hSet.add(10);
		hSet.add(11);
		hSet.add(15);
//		hSet.add(null);
		
		System.out.println(hSet);
		
//		Set<Integer> tSet = TreeSet<>();
		
	}
	

}
