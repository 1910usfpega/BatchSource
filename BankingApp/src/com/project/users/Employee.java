package com.project.users;

public class Employee extends Person{
	
	public Employee(String name, String last, String username,String password) {
		super(name, last,username,password);
	}
	//View Username and Password
	public void viewPersonal(Customer a) {
		System.out.println("name: "+a.getName() +" "+ a.getLast()+" : Username " + a.getUsername());
	}
	public void viewAccount(Customer a) {
		bankAccount [] b =a.allAccounts(a);
		for(bankAccount x: b)
			System.out.print(x.getAccountNumber());
		}
	
	
}
