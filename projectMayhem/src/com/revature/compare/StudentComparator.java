package com.revature.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
//second method of comparing - implement Comparator and implement compare
	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return (int) ((arg0.getGpa()-arg1.getGpa())*100);
	}
	
	

}
