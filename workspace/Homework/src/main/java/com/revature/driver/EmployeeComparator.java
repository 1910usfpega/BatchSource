package com.revature.driver;

import java.util.Comparator;

import com.revature.bean.Employee;

public class EmployeeComparator implements Comparator{

	

//	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
