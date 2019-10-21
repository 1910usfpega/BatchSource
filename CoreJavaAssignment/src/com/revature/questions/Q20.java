package com.revature.questions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Q20 {
	public static String main(String[] args) {
		StringBuilder str = new StringBuilder();
		try(InputStream input = new FileInputStream(new File("Data.txt"));) {
			
			int byt=0;
			while((byt=input.read()) != -1) {
				char ch = (char) byt;
				str.append(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] eachLine=str.toString().split("\n");
		for(String x:eachLine) {
			String[] each=x.split(":");
			System.out.println("Name: "+each[0]);
			System.out.println("Age: "+each[1]);
			System.out.println("State: "+each[2]);
			System.out.println();
		}
		return str.toString();
	}

}
