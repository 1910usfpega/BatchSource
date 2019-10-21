package com.john;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q19DisplayArray {
	
	
	public static void createArray() {
	ArrayList<Integer> aL = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			aL.add(i);
		}
		System.out.println("This is an the Array: " + aL);
	}
	
	public static void addEvenArrays() {
		createArray();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
			int	num = i;
			num += i;
			System.out.println("This is the sum of the even numbers: " + num + 10);
			}
		}
	}
	
	public static void addOddArrays() {
		createArray();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
			int	num = i;
			num += i;
			System.out.println("This is the sum of the odd numbers: " + num);
			}
		}
	}
	
	public static void removePrime() {	
//		createArray();
		for (int j = 0; j <= 11; j++) {
			if (j == 0) {
				System.out.print(j);
			} else if (j == 4) {
				System.out.print(j);
			}else if (j == 6) {
				System.out.print(j);
			}else if (j == 9) {
				System.out.print(j);
			}
		}
		
		
	}
//		ArrayList<Integer> aL = new ArrayList<>();
//		for (int i = 0; i <= 11; i++) {
//			aL.add(i);
//		}	
//		Iterator<Integer> itr = aL.iterator();
//        while (itr.hasNext()) {
////            Integer i = itr.next();
//            if (itr.next().intValue() == 2 || itr.next().intValue() == 3 || itr.next().intValue() == 5 || itr.next().intValue() == 7) {
//            aL.remove(itr.next());
//        }
//	System.out.println("This is the new list: " + aL);
//        }
//	}
}
