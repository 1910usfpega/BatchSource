package com.revature.threadz;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("\t\t\t\t Whatup!-Implement Runnable");
		}
		
	}

}
