package com.revature.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question20 {
	
		private static File inFile= new File("question20text");

		public static void readAndPrint() {
			System.out.println("Question 20");
			try (Scanner sc = new Scanner (inFile);) {
				while (sc.hasNext()) {
					String[] person = sc.nextLine().split(":");
					System.out.println("Name: " + person[0] + " " + person[1]);
					System.out.println("Age: " + person[2]);
					System.out.println("State :" + person[3] + "\n");
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
			
	
	}

	
	


