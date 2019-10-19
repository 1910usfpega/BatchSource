package com.project.users;

public class Employee extends Person{
	
	//View Username and Password
	public void viewPersonal(Customer a) {
		System.out.println("name: "+a.getName() + a.getLast());
	}

	public void viewAccount(Customer a) {
		bankAccount [] b =a.allAccounts(a);
		for(bankAccount x: b)
			System.out.print(x.getAccountNumber());
		}
	
	
}
