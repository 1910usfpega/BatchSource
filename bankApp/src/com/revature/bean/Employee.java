package com.revature.bean;

public class Employee extends Person{
	
	public Employee(String name, String last, String username,String password) {
		super(name, last,username,password);
	}
	//View User-name and name
	public void viewPersonal(Customer a) {
		System.out.println("name: "+a.getName() +" "+ a.getLast()+" : Username " + a.getUsername());
	}
	public void viewAccount(Customer a) {
		bankAccount [] b =a.allAccounts();
		for(bankAccount x: b)
			System.out.print("Account number: " + x.getAccountNumber() + " " + "Account Balance: " + x.getBalance());
		}

}