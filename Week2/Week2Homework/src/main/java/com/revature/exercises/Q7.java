package com.revature.exercises;

import java.util.Comparator;

import com.revature.exercises.Q7Employee;



public class Q7 implements Comparator<Q7Employee> {
	
    public int compare(Q7Employee o1, Q7Employee o2) {
        if ((o1.getAge() > o2.getAge())) return 1;
        if ((o1.getAge() < o2.getAge())) return -1;
        return 0;
    }
    
}
 class EmployeeDeptComparator extends Q7 implements Comparator<Q7Employee> {
	 @Override
    public int compare(Q7Employee o1, Q7Employee o2) {
        if ((o1.getDepartment().compareTo(o2.getDepartment()) > o2.getDepartment().compareTo(o1.getName()))) return 1;
        if ((o1.getDepartment().compareTo(o2.getDepartment()) < o2.getDepartment().compareTo(o1.getName()))) return -1;
        return 0;
    }
}
  class EmployeeNameComparator extends EmployeeDeptComparator implements Comparator<Q7Employee> {
	    @Override
	    public int compare(Q7Employee o1, Q7Employee o2) {
	        if ((o1.getName().compareTo(o2.getName()) > o2.getName().compareTo(o1.getName()))) return 1;
	        if ((o1.getName().compareTo(o2.getName()) < o2.getName().compareTo(o1.getName()))) return -1;
	        return 0;
	    }
	}