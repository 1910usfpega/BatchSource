package com.revature.homework;

import com.revature.bean.Employee;
import com.revature.driver.EmployeeComparator;

/******************************************************************************
 * Q11.  Write a program that would access two float-variables from a class that
 *  	 exists in another package. Note, you will need to create two packages 
 *  	 to demonstrate the solution.
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question11 {

	public float[] getFloat() {
		float[] result= {0,0};
		result[0] = Employee.question10a;
		result[1] = EmployeeComparator.question10b;
		
		return result;
		
	}
}
