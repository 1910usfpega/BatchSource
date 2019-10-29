package com.revature.bean;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.revature.daoimpl.Customerdaoimpl;

public abstract class Person {
	String name;
	String last;
	String username;
	String password;
	static Customerdaoimpl a = new Customerdaoimpl();
	
	public Person(String name, String last, String username, String password) {
		this.name = name;
		this.last = last;
		this.username = username;
		this.password = password;
		
	}

	
	public static boolean login(String user, String pw) throws SQLException { 
	if(a.login(user,pw)) 
		return true;
		return false;
	
	}
	public  boolean createNewUser(String user, String fName, String lName,String passWord, boolean Employee) throws SQLException {
        if(this.userCheck(user)) {
            if(Employee) {
                a.createUsers(fName,lName,user,passWord);   
            Employee aa = new Employee(fName,lName,user,passWord);  
            return true;
            }
            else {
                Customer aa = new Customer(fName,lName,user,passWord);  
                return true;
            }
        }
        return false;
        
    }
		
	public static ArrayList<bankAccount> getBankAccountsForIDCheck(){
		a.
		return bankAccounts;
	}
	public static boolean userCheck(String user) { // check username aliabilty
		//select username form user;
		if(cInfo.containsKey(user) == true)
			return true;
		else
			return false;
	}
	public String getName() {
		//select name where username = ?
		return name;
	}

	public String getLast() {
		//select name where username = ?
		return last;
	}

	public String getUsername() {
		return this.username;
	}	
}