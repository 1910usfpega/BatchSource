package com.revature.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.PendingAccount;
import com.revature.bean.bankAdmin;

public class Save {

	//Write all collections to corresponding files
	//If corresponding files do not exist, create them upon first execution
	public static File adminFile = new File("admins.txt");
	public static File employeeFile = new File("employees.txt");
	public static File customerFile = new File("customers.txt");
	public static File pendingAccountFile = new File("pendingAccounts.txt");
	
	public static void save(ArrayList<Customer> cus, ArrayList<Employee> emp,
							ArrayList<bankAdmin> adm, ArrayList<PendingAccount> pen) {
		
		//Write all admins to admin.txt
		try(OutputStream os = new FileOutputStream(adminFile, false)) {
			os.write(adm.toString().getBytes());
			System.out.println("Admin data saved successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Write all employees to employee.txt
		try(OutputStream os = new FileOutputStream(employeeFile, false)) {
			os.write(emp.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Write all customers to customer.txt
		try(OutputStream os = new FileOutputStream(employeeFile, false)) {
			os.write(cus.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Write all pending accounts to pending.txt
		try(OutputStream os = new FileOutputStream(pendingAccountFile, false)) {
			os.write(pen.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
