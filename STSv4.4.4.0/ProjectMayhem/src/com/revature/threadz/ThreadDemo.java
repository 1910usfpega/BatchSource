package com.revature.threadz;

public class ThreadDemo {

	/*
	 * 	2 ways to spin up a thread
	 * 	1st- extend thread and overwrite run()
	 * 	2nd- Implement Runnable interface and overwrite
	 * 
	 * 	3 default threads in Java
	 * 		main, garbage collector, and thread scheduler
	 * 
	 */
	public static void main(String[] args) {
		Thread extendThread = new ExtendThread();
		Thread implementRunnable = new Thread(new ImplementsRunnable());
		implementRunnable.setPriority(10);
		
		//System.out.println("Is this thread alive? " + extendThread.isAlive());
		extendThread.start();
		//System.out.println("Is this thread alive? " + extendThread.isAlive());
		implementRunnable.start();
		for(int i=0; i<100; i++) {
			System.out.println("Hey-Driver");
		}
	}
	
}
