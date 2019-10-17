package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOW {
	private static final String outFile = "output.txt";
	private static final String inFile = "input.txt";

	public void writeOutputStreamContents(String contents) {
		File file = new File(outFile);

//		 os = null;
		
		try (OutputStream os = new FileOutputStream(file, true);) {
			// false overwrites true appends

			os.write(contents.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String readInputStreamContents() {
		File file = new File(inFile);
		StringBuilder sb = new StringBuilder();
		try (InputStream is = new FileInputStream(file)){
//			InputStream is = new FileInputStream(file);
			int b = 0;
			while ((b=is.read())!= -1) {
				char c= (char)b;
				sb.append(c);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
}
