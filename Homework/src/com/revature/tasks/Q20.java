package com.revature.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20 {

	/*
	 * Create a notepad file called Data.txt and enter the following:
	 * Mickey:Mouse:35:Arizona Hulk:Hogan:50:Virginia2 Roger:Rabbit:22:California
	 * Wonder:Woman:18:Montana
	 * 
	 * Write a program that would read from the file and print it out to the screen
	 * in the following format: Name: Mickey Mouse Age: 35 years State: Arizona
	 * State
	 */

	private static final String inFile = "Data.txt";

	public static void main(String [] args) {

		System.out.println();
		System.out.println("==> Q20");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(inFile));
			String line = br.readLine();
			while (line != null) {
				System.out.format(renderOutputByLine(line));

				// read next line
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String renderOutputByLine(String line) {
		String [] dataInTheLine = line.split(":");
		
		String ss_out = "Name: " + dataInTheLine[0].toString() + " " + dataInTheLine[1].toString() + "\n";
		ss_out = ss_out + "Age: " + dataInTheLine[2].toString() + " years\n";
		ss_out = ss_out + "State: " + dataInTheLine[3].toString() + "\n\n";
		
		return ss_out;
	}

}
