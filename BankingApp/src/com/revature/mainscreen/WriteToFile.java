package com.revature.mainscreen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.revature.storage.CustomerStorage;
import com.revature.user.Customer;

public class WriteToFile {
	private static final String outFile="output.txt";
	private static final String outFileP="outputP.txt";
	
	public void writeCustomers() {
		Collection<Customer> customers= CustomerStorage.getOnlyCustomers();
		for(Customer c : customers) {
			
		}
		
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(outFile));) {
			os.write((customers).getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writePasswords(String contents) {
		
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(outFileP));) {
			os.write(contents.getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
