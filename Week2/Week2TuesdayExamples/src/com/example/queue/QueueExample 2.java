package com.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		/*
		 * Queue being an interface requires a concrete class to actually create
		 * an object of type Queue.
		 * Most common classes are PriorityQueue or LinkedList.
		 * essentially the same, as long as items are added and removed from opposite sides
		 */
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i=-2; i<5; i++) {
			q.add(i);
		}
		System.out.println("Elements of queue: " + q);
		
		//remove head of queue
		int x = q.remove();
		System.out.println("removed element " + x);
		
		System.out.println("q " + q);
		
		
	}

}
