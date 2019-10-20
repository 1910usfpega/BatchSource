package com.revature.mainscreen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.revature.storage.CustomerStorage;
import com.revature.user.Account;
import com.revature.user.Customer;

public class WriteToMyFile {
	private static final String outFile = "SavedCustomers.txt";
	//private static final String outFileP = "outputP.txt";

	public static void writeCustomers() {
		String tempString = "";
		ArrayList<String> strings=new ArrayList<String>();
		Collection<Customer> customers = CustomerStorage.getOnlyCustomers();
		for (Customer c : customers) {
			tempString="";
			tempString += c.getUsername();
			tempString += ";";
			tempString += c.getPassword();
			tempString += ":";
			for (Account a : c.getOnlyAccounts()) {
				tempString += a.getAccountNumber();
				tempString += ",";
				tempString += a.getAccountType();
				tempString += ",";
				tempString += a.getAccountBalance();
				tempString += ";";
			}
			
			strings.add(tempString);
			
		}
		write(strings);
	}

	public static void write(ArrayList<String> str) {
		
		try (OutputStream out = new FileOutputStream(new File(outFile),false);) {
			for(String s:str) {
				out.write((s+"\n").getBytes());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	///////////////////////////////////////////

}
