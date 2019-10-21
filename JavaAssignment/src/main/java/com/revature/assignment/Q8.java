package com.revature.assignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q8 {
	
	public static void palsOnPals() {
		int a = 0;
		ArrayList<String> pal = new ArrayList<>();
		pal.add("Karan");
		pal.add("madam");
		pal.add ("tom");
		pal.add ("civic");
		pal.add ("jimmy");
		pal.add ("kayak");
		pal.add ("john");
		pal.add ("refer");
		pal.add ("billy");
		pal.add("did");
	System.out.println(pal);	
	ArrayList<String> storeEm = new ArrayList<>();
	ListIterator<String> iterator = pal.listIterator();

	while(iterator.hasNext()) {

		char[] cArray = iterator.next().toCharArray();

		a = 0;

		while((cArray.length - a - 1) > 0) {


			if(!(cArray[a] == cArray[cArray.length - a - 1])) { 

				break;

			} 
			
			if((cArray.length - a - 1) == a) {

				String string = String.copyValueOf(cArray);

				storeEm.add(string);

			}

			a++;

		}

	}

	
	System.out.println("\nStore all them pals");

	System.out.print(storeEm);
	
	
}
	}