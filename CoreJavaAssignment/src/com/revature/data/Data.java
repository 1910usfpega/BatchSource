package com.revature.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Data {

	public static void main(String[] args) {
		String strin = "";
		try {
			InputStream in = new FileInputStream(new File("Data.txt"));
			int str;

			while ((str = in.read()) != -1) {
				char let = (char ) str;
				strin += let;}
			in.close();
		} catch (IOException e) {
		}
		System.out.println(strin);
		String[] each = strin.split("\n");
		
		for(String n: each) {
			String[] info = n.split(":");
			System.out.println("Name: " + info[0] + " " + info[1]);
			System.out.println("Age: " + info[2]);
			System.out.println("State: " + info[3]);
			System.out.println("");
		}
		
	}

}
