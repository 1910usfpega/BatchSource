package com.example.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<>(); 
		numbers.add(10);
		numbers.add(52);
		numbers.add(77);
		numbers.add(10);
		numbers.add(42); 
		System.out.println(numbers.get(2)); 
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Dog");
		words.add("Pupper");
		words.add("Doggo");
		words.add("Cat");
		words.add("HotDog");
		//ListIterator to traverse the list
        //no need to use for loop to traverse lists
        ListIterator<String> iterator = words.listIterator();
        
        //traverse the list on forward direction
        System.out.println("Display list elements in forward direction: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        
        //traversing backward direction
        System.out.println("Display list elements in backward direction: ");
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " ");
        }
        
    }

}
