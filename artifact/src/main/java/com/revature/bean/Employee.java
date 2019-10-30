package com.revature.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.daoimpl.BankDaoImpl;
import com.revature.daoimpl.Customerdaoimpl;
import com.revature.daoimpl.EmployeeDaoimpl;

public class Employee extends Person{
	EmployeeDaoimpl e = new EmployeeDaoimpl();
	static Customerdaoimpl aa= new Customerdaoimpl();
	static BankDaoImpl bank = new BankDaoImpl();
	public Employee(String name, String last, String username,String password) {
		super(name, last,username,password);
		//insert into customer (fname,lname,username,pass);S
	}
	//View User-name and name
	public void viewPersonal(Customer a) {// select fname lname where user name = ?;
		System.out.println("name: "+a.getName() +" "+ a.getLast()+" : Username " + a.getUsername());
	}
	public void viewAccount(Customer a) throws SQLException {//select accountnumber amount form owner where username = ?
		ArrayList<bankAccount> b = bank.getAllAccounts(a.getUserName());
		for(bankAccount x: b)
			System.out.print("Account number: " + x.getAccountNumber() + " " + "Account Balance: " + x.getBalance());
		}
	
	public boolean deleteUserAccount(int accountNumber,String Username) throws SQLException {
		boolean test = false;
		try {
		e.deleteBankAccount(accountNumber, Username);
		test = true;
		}catch(Exception e) {
			test = false;
		}
		return test;
	}
	public boolean addBankAccount(bankAccount s, String username) {
		boolean test = false;
		try {
		e.addBankAccount(s, username);
		test = true;
		}catch(Exception e) {}
	return test;
	}
	public void newEmployee(String username,String fname,String lname, String password) throws SQLException {
		e.newEmployee(username, fname, lname, password);
	}

}