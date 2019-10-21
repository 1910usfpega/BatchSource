/*Create a notepad file called Data.txt and enter the following:
Mickey:Mouse:35:Arizona
Hulk:Hogan:50:Virginia2
Roger:Rabbit:22:California
Wonder:Woman:18:Montana
 
Write a program that would read from the file and print it out to the screen in the following format:
 
Name: Mickey Mouse
Age: 35 years
State: Arizona State
*/

package com.homework.assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ProblemTwenty {

	// String[] tokens = str.split(",");

	private static final String fileName = "Data.txt";

	public static void readFile() {
		File file = new File(fileName);
		StringBuilder s = new StringBuilder();
		try(InputStream is = new FileInputStream(file)) {
			
			int b = 0;
			while((b = is.read()) != -1) {
				char c = (char)b;
				s.append(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
