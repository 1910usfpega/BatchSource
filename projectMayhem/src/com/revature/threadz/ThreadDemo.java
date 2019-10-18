package com.revature.threadz;

public class ThreadDemo {
	/*
	 * 2 ways to spin up a thread
	 * 1st - extend Thread and overwrite 
	 * 2nd - Implement Runnable interface and overwrite run()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread extendThread= new ExtendThread();
		Thread implementRunnable= new Thread(new ImplementRunnable());//ressoucing
		implementRunnable.setPriority(10);//max priority
		//System.out.println("Is ExtendThread Alive?" + extendThread.isAlive()); OR
		extendThread.start();
		for(int i=0;i<100;i++) {
			System.out.println("Hey Driver ");
		}
	}

}
