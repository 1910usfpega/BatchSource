package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<StudentW> studentList= new ArrayList<StudentW>();
		studentList.addAll(Arrays.asList( 
				new StudentW[] {
						new StudentW(15, "Matt", 6.59),
						new StudentW(21, "Ben", 1.33),
						new StudentW(63, "Derron", 8.04),
						new StudentW(10, "Sir James Todd I", 0.50),
						new StudentW(44, "B-Rizzle", -1.0),
						new StudentW(65, "Kyle Dawg Woo", 4.6)
				}));
		System.out.println("Original List");
		for(StudentW s: studentList) {
			System.out.println(s);
		}
		System.out.println("=============================");
		Collections.sort(studentList);
		System.out.println("Sorted by ID");
		for(StudentW s: studentList) {
			System.out.println(s);
		}
		System.out.println("=============================");
		Collections.sort(studentList, new StudentComparator());
		System.out.println("Sorted by GPA");
		for(StudentW s: studentList) {
			System.out.println(s);
		}
	}

}
