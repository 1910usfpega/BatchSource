package com.revature.q20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	private static File infile = new File("Data.txt");
	
	//SPLIT makes use of delimiter!!
	//scanner.getNextLine().split("delimiter");
	
	public static void readAndPrint() {
		System.out.println("Q20");
		try (Scanner sc = new Scanner(infile);) {
			while (sc.hasNext()) {
				String[] person = sc.nextLine().split(":");
				System.out.println("Name: " + person[0] + " " + person[1]);
				System.out.println("Age: " + person[2]);
				System.out.println("State: " + person[3] + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}