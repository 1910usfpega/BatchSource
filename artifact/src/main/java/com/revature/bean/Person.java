package com.revature.bean;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.daoimpl.Customerdaoimpl;
import com.revature.daoimpl.EmployeeDaoimpl;
import com.revature.daoimpl.BankDaoImpl;

public abstract class Person {
	String name;
	String last;
	String username;
	String password;
	static Customerdaoimpl a = new Customerdaoimpl();
	static  BankDaoImpl b = new BankDaoImpl();
	static EmployeeDaoimpl e = new EmployeeDaoimpl();
	public Person(String name, String last, String username, String password) {
		this.name = name;
		this.last = last;
		this.username = username;
		this.password = password;
		
	}

	
	public static boolean login(String user, String pw) throws SQLException { 
	if(a.logIn(user,pw)) 
		return true;
		return false;
	
	}
	public  boolean createNewUser(String user, String fName, String lName,String passWord) throws SQLException {
        if(Person.userCheck(user)) {
                a.createUsers(fName,lName,user,passWord); 
            return true;
            }
        return false;
        
    }
	public static boolean userCheck(String user) throws SQLException { // check username aliabilty
		ArrayList<Customer> aa = a.getAllCustomer(); 
		if(! aa.isEmpty()) {
			for(Customer x: aa) {
			if(x.getUserName().equals(user))
				return false;
			}
		}
		else {return true;}
		return true;
	}
	public String getName() {
		return name;
	}

	public String getLast() {
		return last;
	}

	public String getUsername() {
		return this.username;
	}	
}