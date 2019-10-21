package com.revature.q20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

	private static File infile = new File("Data.txt");

	public static void readAndPrint() {
		ArrayList<Person> pList = new ArrayList<>();
		System.out.println("Q20");
		try (Scanner sc = new Scanner(infile);) {
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}