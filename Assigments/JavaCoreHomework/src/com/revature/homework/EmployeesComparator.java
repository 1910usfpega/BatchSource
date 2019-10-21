package com.revature.homework;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employees>{
	
	@Override
	public int compare(Employees arg0, Employees arg1) {
		return (int) ((arg0.getAge()-arg1.getAge())*100);
	}

}
