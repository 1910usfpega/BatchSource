package com.revature.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.bean.Person;

/******************************************************************************
 *  Q20. Create a notepad file called Data.txt and enter the following:
 *  		Mickey:Mouse:35:Arizona
 *  		Hulk:Hogan:50:Virginia
 *  		Roger:Rabbit:22:California
 *  		Wonder:Woman:18:Montana
 *  
 *  Write a program that would read from the file and print it out to the screen
 *  	 in the following format:
 *  
 * 		 Name: Mickey Mouse
 * 		 Age: 35 years
 * 		 State: Arizona State
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question20 {
	
	private static final String inFile="Data.txt";
		
		//Read a string from a file
		public ArrayList<String> readInputStreamContents() {
			File file = new File(inFile);
			ArrayList<String> s = new ArrayList<String>();
			
			try (Scanner sc= new Scanner(file);){
				
//				int b=0;
				while(sc.hasNext()) {
//					char c= (char)b;
					s.add(sc.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return s;
		}
		public void printPerson() {
			ArrayList<String> s = readInputStreamContents();
			for(int i=0;i<s.size();i++) {
			String [] a = s.get(i).split(":");
			Person p = new Person(a[0]+" "+a[1],a[3], Integer.parseInt(a[2]));
			System.out.println(p.toString());
			System.out.println();
		}
		}
}
