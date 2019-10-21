package com.revature;

import java.util.Comparator;



public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1.getAge() > o2.getAge())) return 1;
        if ((o1.getAge() < o2.getAge())) return -1;
        return 0;
    }
    
}
 class EmployeeDeptComparator extends EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1.getDepartment().compareTo(o2.getDepartment()) > o2.getDepartment().compareTo(o1.getName()))) return 1;
        if ((o1.getDepartment().compareTo(o2.getDepartment()) < o2.getDepartment().compareTo(o1.getName()))) return -1;
        return 0;
    }
}
  class EmployeeNameComparator extends EmployeeDeptComparator implements Comparator<Employee> {
	    @Override
	    public int compare(Employee o1, Employee o2) {
	        if ((o1.getName().compareTo(o2.getName()) > o2.getName().compareTo(o1.getName()))) return 1;
	        if ((o1.getName().compareTo(o2.getName()) < o2.getName().compareTo(o1.getName()))) return -1;
	        return 0;
	    }
	}
