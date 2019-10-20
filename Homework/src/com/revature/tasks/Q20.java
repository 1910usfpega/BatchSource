package com.revature.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20 {
	
	/* Create a notepad file called Data.txt and enter the following:
	 * Mickey:Mouse:35:Arizona
	 * Hulk:Hogan:50:Virginia2
	 * Roger:Rabbit:22:California
	 * Wonder:Woman:18:Montana
	 * 
	 * Write a program that would read from the file and print it out to the screen in the following format:
	 * Name: Mickey Mouse
	 * Age: 35 years
	 * State: Arizona State
	 */
	
	private static final String inFile = "Data.txt";

	public static void driver() {
		
		System.out.println();
		System.out.println("==> Q20");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(inFile));
			String line = br.readLine();
			while (line != null) {
				String [] dataInTheLine = line.split(":");
				
				System.out.format("Name: %s %s \n", dataInTheLine[0], dataInTheLine[1]);
				System.out.format("Age: %s years\n", dataInTheLine[2]);
				System.out.format("State: %s\n", dataInTheLine[3]);
				System.out.println();
				
				// read next line
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
