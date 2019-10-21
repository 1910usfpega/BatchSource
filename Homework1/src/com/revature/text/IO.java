package com.revature.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class IO {
	private static final String data = "Data.txt";
	
	public static void readData(ArrayList<Citizen> citizens) {
		File file = new File(data);
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader(data));
			String line = reader.readLine();
			while (line != null) {
				String unsplit = line;
				String[] split = unsplit.split(":");
				Citizen temp = new Citizen(split[0], split[1], Integer.valueOf(split[2]), split[3]);
				citizens.add(temp);
			}
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
