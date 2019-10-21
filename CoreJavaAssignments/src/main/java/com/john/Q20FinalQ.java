package com.john;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q20FinalQ {
	
	public ArrayList<String> readInputStreamContents() {
		File file = new File("inFile.txt");
		ArrayList<String> s= new ArrayList<String>();
		try (Scanner is = new Scanner(file);){
			
			while(is.hasNext()) {
				s.add(is.nextLine());
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
	
	public void printfileContents() {
		ArrayList<String> boi = readInputStreamContents();
		Person p = new Person();
		for (int i = 0; i< boi.size(); i++) {
			String [] oi = boi.get(i).split(":");
			p.setName(oi[0] + oi[1]);
			p.setAge(Integer.parseInt(oi[2]));
			p.setState(oi[3]);
			System.out.println(p.toString());
		}
		
	}
}
