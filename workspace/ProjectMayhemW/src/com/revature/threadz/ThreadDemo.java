package com.revature.threadz;

public class ThreadDemo {

	/*
	 * 2 ways to spin up a thread
	 * 1st - extends Thread and overwrite run()
	 * 2nd - implements Runnable  interface and overwrite run()
	 * 
	 */

	public static void main(String[] args) {
		Thread extendThread = new ExtendThread();
		Thread implementRunnable= new Thread(new ImplementRunnable());
		
//		System.out.println("Is ExtendThread Alive?"+ extendThread.isAlive());
		extendThread.start();
//		System.out.println("Is ExtendThread Alive?"+ extendThread.isAlive());
		implementRunnable.setPriority(10);
		for(int i=0;i<25;i++) {
			System.out.println("Hey-Driver");
		}
	}

}
