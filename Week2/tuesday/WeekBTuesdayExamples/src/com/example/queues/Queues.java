package com.example.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList <>();
		for (int i=-2; i<5; i++) {
			q.add(i);
			
		}
		System.out.println("Elemetns of queue:" + q);
		
		int x = q.remove();
		String y = null;
		System.out.println("y:" + y);
	}

}
