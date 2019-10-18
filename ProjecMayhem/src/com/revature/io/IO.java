package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	private static final String outFile = "outfile.txt";
	private static final String inFile = "input.txt";
	
	public void writeOutputStreamCOntents(String contents) {
		File file = new File(outFile);
		try(OutputStream os = new FileOutputStream(file, true);) {
			os.write(contents.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readInputStreamContent() {
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
		try (InputStream is = new FileInputStream(file);){
			int b=0;
			while ((b=is.read())!=-1) {
				char c= (char)b;
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
