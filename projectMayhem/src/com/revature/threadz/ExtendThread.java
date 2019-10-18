package com.revature.threadz;

public class ExtendThread extends Thread{
	
	@Override//we are overriding the Thread class because it exists and we define our own method
	public void run() {
		
		for(int i=0; i<100;i++) {
			System.out.println("\t\t Hi-ExtendeThread");//\t is tab
		}
		
	}

}
