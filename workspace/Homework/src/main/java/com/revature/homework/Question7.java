package com.revature.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.revature.bean.Employee;

/******************************************************************************
 * Q7. Sort two employees based on their name, department, and age using the
 * Comparator interface.
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question7 implements Comparator<Employee> {
	// Second method of comparing- implement Comparator and implement compare
	

	@Override
	public int compare(Employee arg0, Employee arg1) {
		return (arg0.getAge() - arg1.getAge());
	}

	//ok so Lambdas ARE usefull after all...
	public void sortCompany(List<Employee> result) {
		Collections.sort(result,(arg0,arg1)
				->{
					return arg0.getCompany().compareTo(arg1.getCompany()
							);}
				);
		
	}
	
	public void sortName(List<Employee> e) {
		Collections.sort(e,(arg0,arg1)
				->{
					return arg0.getName().compareTo(arg1.getName()
							);}
				);
	}
	
//	public int compareName(Employee arg0, Employee arg1) {
//
//		return arg0.getName().compareTo(arg1.getName());
//	}
//	public int compareCompany(Employee arg0, Employee arg1) {
//		return arg0.getCompany().compareTo(arg1.getCompany());
//	}

}
