package com.revature.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question20 {

	public static String finale() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("Data.txt"));
			String str = reader.readLine();
			while (str !=null) {
				System.out.println(str);
				String[] lines = str.split(":");
				System.out.println("Name: "+lines[0]+" "+lines[1]);
				System.out.println("Age: "+lines[2]);
				System.out.println("State: "+lines[3]);
				str = reader.readLine();
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}return " ";
	}
	
}

