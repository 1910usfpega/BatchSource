package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {
	
	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student [] {
						new Student(15, "Matt", 6.59),
						new Student(63, "Ben", 16),
						new Student(10, "Derron", 26),
						new Student(44, "B-Riwwle", -1),
						new Student(65, "Kile", 80)
				}
				));
		System.out.println("Originel List");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("====================");
		Collections.sort(studentList);
		System.out.println("Sorted by StudentID");
		for(Student s: studentList) {//enhanced for loop
			System.out.println(s);
		}
		System.out.println("====================");
		Collections.sort(studentList, new StudentComparator());
		System.out.println("Sorted by GPA");
		for(Student s: studentList) {//enhanced for loop
			System.out.println(s);
		}
		System.out.println("====================");
		System.out.println("Sorted by Label w/ Lambda");
		//Functional interfaces that have 1 (not default) method 
		//we can do lambda w/ these
		Collections.sort(studentList, (arg0,arg1)
				->{//lambda operator
			return arg0.getLablel().compareTo(arg1.getLablel());//try to getGpa and determine the return tyoe  
		});
		for(Student s: studentList) {
			System.out.println(s);
		}
		
				
		
	}
}
