package com.revature.storage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Import {
	private static final String dataFile = "Data.txt";

	public static Bank read() {
		try (ObjectInputStream data = new ObjectInputStream(new FileInputStream(dataFile));) {
			Bank bank = (Bank) data.readObject();
			return bank;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
