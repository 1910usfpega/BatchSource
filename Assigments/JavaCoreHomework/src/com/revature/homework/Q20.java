package com.revature.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20 {

	public static String main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("/C:/Users/kylea/Desktop/Data.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				String[] eachline = line.split(":");
				System.out.println("Name: "+eachline[0]+ " "+eachline[1]);
				System.out.println("Age: "+eachline[2]);
				System.out.println("State: "+eachline[3]);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return "Reading";}
}
