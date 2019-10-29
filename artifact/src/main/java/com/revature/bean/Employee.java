package com.revature.bean;

public class Employee extends Person{
	
	public Employee(String name, String last, String username,String password) {
		super(name, last,username,password);
		//insert into customer (fname,lname,username,pass);S
	}
	//View User-name and name
	public void viewPersonal(Customer a) {// select fname lname where user name = ?;
		System.out.println("name: "+a.getName() +" "+ a.getLast()+" : Username " + a.getUsername());
	}
	public void viewAccount(Customer a) {//select accountnumber amount form owner where username = ?
		bankAccount [] b =a.allAccounts();
		for(bankAccount x: b)
			System.out.print("Account number: " + x.getAccountNumber() + " " + "Account Balance: " + x.getBalance());
		}

}