package com.revature.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	//Second method of compare - implement Comparator and compare()
	@Override
	public int compare(Student arg0, Student arg1) {
		
		return (int) ((arg0.getGPA()-arg1.getGPA())*100);
	}
	
	
}
