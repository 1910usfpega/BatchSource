package com.revature.storage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.List;

import com.revature.storage.Bank;

public class ExportData {
	private static final String dataFile="Data.txt";
//	private static List<Bank> b = new ArrayList<Bank>();
	
	public static void write(Bank bank) {
		
		try(ObjectOutputStream data = new ObjectOutputStream(new FileOutputStream(dataFile));){
			data.writeObject(bank);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
