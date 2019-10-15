package com.example.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		/*
		 * Sets
		 * Data structure inside the Collection API
		 * only allow for storage of Objects
		 * 
		 * To actually utilize primitive data types, we
		 * use Wrapper Classes
		 * 
		 * int -> Integer
		 * boolean -> Boolean
		 * byte -> Byte
		 * 
		 * the process of converting a primitive data type into
		 * its Wrapper class is called boxing (autoboxing)
		 * Wrapper -> primitive = unboxing
		 */
		
		Set<Integer> hSet = new HashSet<>();
		hSet.add(5);
		hSet.add(7);
		hSet.add(12);
		hSet.add(9);
		hSet.add(12);
		hSet.add(24);
		hSet.add(62);
		hSet.add(5);
		//hSet.add(null);
		System.out.println(hSet);
		
		Set<Integer> tSet = new TreeSet<>();
		tSet.addAll(hSet);
		System.out.println(tSet);
	}

}
