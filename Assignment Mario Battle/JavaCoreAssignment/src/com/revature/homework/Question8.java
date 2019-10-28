package com.revature.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Question8 {
	public static String bucket;
	public static String pallyOMalley(){
		ArrayList<String> notPals= new ArrayList<String>();
		notPals.add("karan");
		notPals.add("madam");
		notPals.add("tom");
		notPals.add("civic");
		notPals.add("radar");
		notPals.add("jimmy");
		notPals.add("kayak");
		notPals.add("john");
		notPals.add("billy");
		notPals.add("did");
		System.out.println("There are palindromes inside this list");
		System.out.println(notPals);
		ArrayList<String> pals = new ArrayList<>();
		Iterator<String> iterator = notPals.listIterator();
		while ( iterator.hasNext()) {
			bucket = (iterator.next());
			StringBuilder pally = new StringBuilder(bucket);
			if(pally.reverse().toString().equals(bucket)) {
				pals.add(bucket);
			
			}
		}
		System.out.println("THESE WORDS ARE YOUR FRIENDS");
		System.out.println(pals);
		return "Pally 0'Malley";
	}
}
