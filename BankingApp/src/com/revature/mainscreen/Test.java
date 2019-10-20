package com.revature.mainscreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.revature.storage.EmployeeLoginInfo;
import com.revature.storage.EmployeeStorage;
import com.revature.user.Account;
import com.revature.user.Customer;
import com.revature.user.Employee;

public class Test {

	
	
	
	public static void main(String[] args) {
		Customer testdude = new Customer("sam","bam");
		Account acct = new Account("Savings",testdude);
		HashMap<Integer,Account> myacct = new HashMap<Integer,Account>();
		//ArrayList<Customer> myacct=new ArrayList<Customer>();
		testdude.setMyAccounts(myacct);
//		String temp;
		//String myString=this.username+":"+this.password;
		Iterator<Integer> iter = (Iterator<Integer>) testdude.getMyAccounts().keySet().iterator();
		while(iter.hasNext()) {
			//myString+=":";
			System.out.println(iter.next());
		}
		//sysout myString;
		

	}
	





}
