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
	
	public void deleteUserAccount(int accountNumber,String Username) throws SQLException {
		e.deleteBankAccount(accountNumber, Username);
	}
	public void addBankAccount(bankAccount s, String username) throws SQLException {
		e.addBankAccount(s, username);
	}
	public void newEmployee(String username,String fname,String lname, String password) throws SQLException {
		e.newEmployee(username, fname, lname, password);
	}

}