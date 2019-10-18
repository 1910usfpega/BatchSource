package com.revature.threadz;

public class ThreadDemo {
	/* 
	 * 2 ways to spin up thread
	 * 1st - extend Thread and overwrite run()
	 * 2nd - Implement Runnable interface 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread extendThread = new ExtendThread();
		Thread implementRunnable = new Thread(new ImplementRunnable());
		implementRunnable.setPriority(10);
		System.out.println("Is ExtendThread Alive? " + extendThread.isAlive());
		extendThread.start();
		System.out.println("Is ExtendThread Alive? " + extendThread.isAlive());
		implementRunnable.start();

	}

}
