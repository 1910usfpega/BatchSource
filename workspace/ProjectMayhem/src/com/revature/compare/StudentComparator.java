package com.revature.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentW>{
//Second method of comparing - implement Comparator and implement compare
	@Override
	public int compare(StudentW o1, StudentW o2) {
		
		return (int) ((o1.getGpa()-o2.getGpa())*100);
	}
	

}
