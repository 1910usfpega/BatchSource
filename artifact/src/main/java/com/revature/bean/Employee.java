package com.revature.bean;

import java.sql.SQLException;
import com.revature.daoimpl.BankDaoImpl;
import com.revature.daoimpl.Customerdaoimpl;
import com.revature.daoimpl.EmployeeDaoimpl;

public class Employee extends Person{
	EmployeeDaoimpl e = new EmployeeDaoimpl();
	static Customerdaoimpl aa= new Customerdaoimpl();
	static BankDaoImpl bank = new BankDaoImpl();
	static bankAccount bankaccount = new bankAccount(1,20.5);
	static Customer customer = new Customer("","","username","");
	static Employee employee = new Employee("","","","");
	public Employee(String name, String last, String username,String password) {
		super(name, last,username,password);
	}

	public void viewPersonal(Customer a) {
		System.out.println("name: "+a.getName() +" "+ a.getLast()+" : Username " + a.getUsername());
	}
	public void viewAccount(String username) throws SQLException {
		e.getAllUserBankAccounts(username);
		}
	
	public boolean deleteUserAccount(String Username) throws SQLException {
			e.deleteUser(Username);
		return false;
		
	}
	public boolean deletebankAccount(String Username,int accountNumber) throws SQLException {
		e.deleteBankAccount(accountNumber, Username);;
	return false;
	
}
	public boolean addBankAccount(bankAccount s, String username) {
		boolean test = false;
		
		try {
		e.addBankAccount(s, username);
		test = true;
		}catch(Exception e) {}
	return test;
	}
	

	

}