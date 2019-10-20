package com.revature.mainscreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {
	private static final String inFile="input.txt";
	private static final String inFileP="inputP.txt";
	
	
	public String readCustomers() {
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
		try(InputStream is = new FileInputStream(file);) {
			
			int b=0;
			while((b=is.read()) != -1) {
				char c = (char) b;
				s.append(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s.toString();
	}

}
