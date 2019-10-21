package assignments;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private String department;
	private int age;
	
	public Employee() {
		super();
	}
	
	//super class constructor with fields
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}

	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	//Output employee info
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}
	
}
