package com.revature.threadz;

public class ImplementsRunnable implements Runnable{
		
	@Override 
	public void run(){
		for(int i=0; i<100; i++) {
			System.out.println("\t\t\t\t What up-Implement Runnable");
		}
	}
	
}
