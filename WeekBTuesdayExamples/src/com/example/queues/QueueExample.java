package com.example.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	/*
	 * Queue being an interface requires a concrete class to actually
	 * create an object of type Queue.
	 * The most common classes are PriorityQueue or LinkedList.
	 * 
	 * Essentially, they are the same thing as long as items are added
	 * and removed from opposite sides.
	 */
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		for(int i=-2; i<5; i++) {
			q.add(i);
		}
		System.out.println("Elements of queue: " + q);
		
		//remove the head of the queue
		int x = q.remove();
		System.out.println("removed element: " + x);
		
		int y = q.peek();
		System.out.println("y: " + y);
		
		int size = q.size();
		System.out.println("size of queue: " + size);
	}

}
