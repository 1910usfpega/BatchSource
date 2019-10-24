package com.example.lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(52);
		numbers.add(77);
		numbers.add(10);
		numbers.add(42);
		//System.out.println(numbers.get(2));
		
		
		ArrayList<String> words = new ArrayList<>();
		/*
		 * Iterators
		 * A universal iterator that we can apply to any Collection object.
		 * 
		 * By using Iterator, we can perform both read and remove
		 * operations
		 */
		words.add("Dog");
		words.add("Pupper");
		words.add("Doggo");
		words.add("Cat");
		words.add("HotDogh");
		
		//ListIterator to traverse the list
		ListIterator<String> iterator = words.listIterator();
		
		//Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direction: ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		//Traversing the list in backward direction
		System.out.println("\n" + "Displaying list elements in backward direction: ");
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
		}
	}

}
