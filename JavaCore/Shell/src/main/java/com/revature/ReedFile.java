package com.revature;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReedFile {

	public static void foil() {
		String fileName = "C:/Users/Redfox/Documents/Git/Spring/Data.txt";
		String line = null, line2 =null;
		int colon = 0;
	       // FileReader reads text files in the default encoding.
       try {
		FileReader fileReader = 
            new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
        	

            	 line2 = line.replace(":", " ");
            	//line2 = line2.replaceFirst(" ", "\n");
            	System.out.println(line2);}
        	
        	
          

        // Always close files.
        bufferedReader.close();         
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
        // Or we could just do this: 
        // ex.printStackTrace();
    }
	}
}
