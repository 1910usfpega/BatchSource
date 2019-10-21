import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortEmployees {
	public static void sortTwoEmployees() {
		List<Person> employees = new ArrayList<Person>();
		Person p1 = new Person("Frank Frane", "Accounting", 42);
		Person p2 = new Person("James Fuley", "Financing", 24);
		employees.add(p1);
		employees.add(p2);
		Collections.sort(employees);//Does the sorting algorithm of the objects
		System.out.println("Sorted two employee objects");
		System.out.println(employees);
	}
}
