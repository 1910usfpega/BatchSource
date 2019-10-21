package com.revature.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20 {
//need Data.txt file
	public static void characters() throws IOException {
	       BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
	       String line;
	       while((line = reader.readLine()) != null) {
	           String notReal[] = line.split(":");
	           System.out.println("Name: " + notReal[0] + notReal[1]);
	           System.out.println("Age: " + notReal[2] + " years");
	           System.out.println("State: " + notReal[3] + " State\n");
	       }
	      
	      
	       reader.close();
	   }
}
