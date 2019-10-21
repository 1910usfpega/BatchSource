package com.revature.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.PendingAccount;
import com.revature.bean.bankAdmin;

public class Save {

	// Write all collections to corresponding files
	// If corresponding files do not exist, create them upon first execution
	public static final File adminFile = new File("admins.txt");
	public static final File employeeFile = new File("employees.txt");
	public static final File customerFile = new File("customers.txt");
	public static final File pendingAccountFile = new File("pendingAccounts.txt");

	public static void writeData(ArrayList<Customer> cus, ArrayList<Employee> emp, ArrayList<bankAdmin> adm,
			ArrayList<PendingAccount> pen) {

		// Write all admins in admin collection to admin.txt
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(adminFile, false));) {
			objOut.writeObject(adm);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write all employees to employee.txt
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(employeeFile, false));) {
			objOut.writeObject(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write all customers to customer.txt
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(employeeFile, false));) {
			objOut.writeObject(cus);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write all pending accounts to pending.txt
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(pendingAccountFile, false));) {
			objOut.writeObject(pen);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//End method writeData

}//End class Save
