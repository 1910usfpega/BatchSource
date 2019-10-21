
public class Person implements Comparable<Person>{
	private String name;
	private String department;
	private int age;
	//No-Args Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//Constructor with fields
	public Person(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	//Geters and Setters
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
	//ToString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
