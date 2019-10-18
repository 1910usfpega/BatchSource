package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	
	private static final String outFile = "output.txt";
	private static final String inFile="input.txt";
	
	public void writeOutputStreamContents(String contents) {
		File file = new File(inFile);
//		OutputStream os = null;
		
		try {//try with resources
			//false will override, true will append
			OutputStream os = new FileOutputStream(file,true);{
			os.write(contents.getBytes());
//			if(os!=null) {
//				System.out.println(os);
//				os.close();
//			}
			}
		} catch (FileNotFoundException e) {//it is a IO type of exception so the order matters
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		finally {//throws a code if we have an exception
//			os.close();
//		}		
	}
	
	public String readInputStreamContents() {
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
		InputStream is;
		try {
			is = new FileInputStream(file);{
				int b = 0;
			    while((b=is.read())!=-1) {//-1 is end of the line !=-1 if there is no next line
				char c= (char)b;
				s.append(c);
			    }
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s.toString();
	}

}

