package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.addAll(Arrays.asList(new Student[] { new Student(31, "Andy", 4.00), new Student(1, "Alex", 3.30),
                new Student(3, "Test", 2.05), new Student(313, "Run", 1.20), new Student(324, "Trip", 4.00),
                new Student(075, "Steve", 2.50) }));
        
        System.out.println("Original List");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("==================");
        System.out.println("Sorted by StudentID");
        Collections.sort(studentList);
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("==================");
        System.out.println("Sorted by GPA");
        Collections.sort(studentList, new StudentComparator());
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("==================");
        System.out.println("Sorted by Label with Lambda");
        // functional interfaces have 1 (not default) method.
        // we can do lambdas with these
        Collections.sort(studentList, (o1, o2) -> {
            return o1.getLabel().compareTo(o2.getLabel());
        }

        );
        for (Student s: studentList) {
            System.out.println(s);
        }

    }
}   


