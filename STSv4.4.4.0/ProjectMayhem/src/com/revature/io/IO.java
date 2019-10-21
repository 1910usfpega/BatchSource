package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {

	private static File file = new File("output.txt");
	private static File inFile = new File("intput.txt");
	
	public void writeOutputStreamContents(String contents) {
		

		//OutputStream os=null;
		
		// False will overwrite, true will append
		try(OutputStream os = new FileOutputStream(file, true);) {
			os.write(contents.getBytes());
			System.out.println("Inserting \"" + contents + "\" to file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				os.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}
	
//	public String readInputStreamContents() {
//		File file = new File(inFile);
//		StringBuilder s = new StringBuilder();
//		InputStream is = new FileInputStream(file);
//		int b = 0;
//		while((b=is.read()) != -1) {
//			char c = (char)b;
//			s.append(c);
//		}
//		return s.toString();
//	}

}
