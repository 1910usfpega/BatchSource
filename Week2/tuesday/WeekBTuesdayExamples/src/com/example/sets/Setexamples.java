package com.example.sets;

import java.util.HashSet;
import java.util.Set; 
public class Setexamples {

	public static void main(String[] args) {
		
		/*
		 * Sets
		 * Data structure imside the collection API
		 * Only allow for storage of objects
		 * 
		 * To actually utilize primitive datat types, we use wrapper classes
		 * 
		 * int -> Integer
		 * boolean -> Boolean
		 * byte -> Byte
		 * 
		 * the process of converting primitive data type into its wrapper class is called boxing.
		 * Wrapper -> primitive unboxing
		 */
		
		Set<Integer> hSet = new HashSet<>(); 
		hSet.add(5);
		hSet.add(98);
		hSet.add(62);
		hSet.add(58);
		hSet.add(4);
		
		System.out.println(hSet);
		
		
		

		
		
		

	}

}
