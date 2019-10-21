package com.revature.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return (int) ((arg0.getAge()-arg1.getAge())*100);
}
}
