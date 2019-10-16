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
						new Student(15,"Matt",6.59),
						new Student(21,"Ben",1.33),
						new Student( 63,"Derron",8.04),
						new Student(10,"Sir James Todd 1st",0.5),
						new Student(44,"B-Rizzle",-1.0),
						new Student(65,"Kyle Dawg Woo",4.6)
				}));
			System.out.println("Original List");
			for(Student s: studentList) {
				System.out.println(s);
			}
			System.out.println("=================");
			Collections.sort(studentList);
			System.out.println("Sorted by StudentID");
			for(Student s: studentList) {
				System.out.println(s);
			}
			System.out.println("=================");
			Collections.sort(studentList, new StudentComparator());
			System.out.println("Sorted by GPA");
			for(Student s: studentList) {
				System.out.println(s);
			}
			System.out.println("=================");
			System.out.println("Sorted by Label w/ Lambda");
			//Functional interfaces have 1 (not default) method
			//we can do lambda w/ these
			Collections.sort(studentList,(arg0,arg1)
					->{
						return arg0.getLabel().compareTo(arg1.getLabel()
								);}
					);
			for(Student s: studentList) {
				System.out.println(s);
			}
	}

}
