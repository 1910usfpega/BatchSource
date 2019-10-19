package com.revature.homework;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.bean.Employee;

/******************************************************************************
 * Q7. Sort two employees based on their  name, department, and age using the 
 *  		Comparator interface.
 *  
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question7Test {

	List<Employee> employeeList= new ArrayList<Employee>();
	List<Employee> resultList = new ArrayList<Employee>();
	ArrayList<Employee> r = new ArrayList<Employee>();
	ArrayList<Employee> e = new ArrayList<Employee>();
	
	@Test
	void testAgeSort() {
		Question7 q = new Question7();
		
		employeeList.addAll(Arrays.asList(
				new Employee [] {
						new Employee("Matt","Revature",150),
						new Employee("John","Bling Bling",100),
						new Employee("Brain","Rover",105),
						new Employee("Velma","Mystery Inc",15),
						new Employee("Don","Disney",5)
				}));
		resultList = employeeList;
		
		Collections.sort(resultList,(arg0,arg1)
				->{
					return arg0.getAge()-arg1.getAge()
							;}
				);
		System.out.println("Results List: ");
		for(Employee i: resultList) System.out.println(i);
		
		System.out.println("Employees Sorted? : ");
		//sorts based age
		//Collections.sort(employeeList, new Question7());
		q.sortName(employeeList);
		
		for(Employee i: employeeList) System.out.println(i);
		
		Employee[] r = resultList.toArray(new Employee[resultList.size()]);
		
		Employee[] e = employeeList.toArray(new Employee[employeeList.size()]);

		assertArrayEquals(r, e);
	}
	
	@Test
	void testCompanySort() {
		
		employeeList.addAll(Arrays.asList(
				new Employee [] {
						new Employee("Matt","Revature",150),
						new Employee("John","Bling Bling",100),
						new Employee("Brain","Rover",105),
						new Employee("Velma","Mystery Inc",15),
						new Employee("Don","Disney",5)
				}));
		Question7 q = new Question7();
		
		resultList = employeeList;
		
		
		
		
		Collections.sort(resultList,(arg0,arg1)
				->{
					return arg0.getCompany().compareTo(arg1.getCompany())
							;}
				);
		Employee[] r = resultList.toArray(new Employee[resultList.size()]);
		
		q.sortCompany(employeeList);
		Employee[] e = employeeList.toArray(new Employee[employeeList.size()]);
		assertArrayEquals(r, e);
	}
	
	@Test
	void testNameSort() {
		employeeList.addAll(Arrays.asList(
				new Employee [] {
						new Employee("Matt","Revature",150),
						new Employee("John","Bling Bling",100),
						new Employee("Brain","Rover",105),
						new Employee("Velma","Mystery Inc",15),
						new Employee("Don","Disney",5)
				}));
		Question7 q = new Question7();
		
		resultList = employeeList;
		
		Collections.sort(resultList,(arg0,arg1)
				->{
					return arg0.getName().compareTo(arg1.getName())
							;}
				);
		Employee[] r = resultList.toArray(new Employee[resultList.size()]);
		
		q.sortName(employeeList);
		
		Employee[] e = employeeList.toArray(new Employee[employeeList.size()]);
		assertArrayEquals(r, e);
	}

}
