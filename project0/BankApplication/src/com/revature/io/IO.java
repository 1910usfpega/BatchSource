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
	private static final String inFile = "account.txt";
	
	public void writeOutputStreamContents(String contents) {
		//File file = new File("output.txt");
		File file = new File(outFile);
		try (OutputStream os = new FileOutputStream(file,true);){
			//false will overite previous data, true will append
			//OutputStream os = new FileOutputStream(file, true);
			os.write(contents.getBytes()); 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
//			if(os != null) {
//				System.out.println(os);
//				os.close(); 
//			}
		
//		} finally {
//			try {os.close(); } catch (IOException e) {catch block e.printStackTrace();}
//			os.close();
//		}
	}
	
	//read a string from a file
	public String readInputStreamContents() {
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
		try(InputStream is = new FileInputStream(file);){
			int b = 0;
			while((b=is.read()) != -1) {
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
		return s.toString();
	}
	
	
	
}
