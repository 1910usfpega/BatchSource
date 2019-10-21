package assignments;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	//Compares the age of the employees
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}
}
