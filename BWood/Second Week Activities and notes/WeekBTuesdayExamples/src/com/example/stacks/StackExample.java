package com.example.stacks;

import java.util.Stack;

public class StackExample {
	
	/*
	 * Stack extends from vector, so the stack belongs to 
	 * the Collection framework
	 */

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stackPush(stack);
		//stackPop(stack);
		stackPeek(stack);
		stackSearch(stack, 2);
		stackSearch(stack, 99);
		System.out.println(stack);
	}
	
	//pushing elements on top of the stack
	public static void stackPush(Stack<Integer> stack) {
		for(int i=0; i<5; i++) {
			stack.push(i);
		}
	}
	
	//popping element from the top of the stack
	public static void stackPop(Stack<Integer> stack) {
		for(int i=0; i<5; i++) {
			Integer y = stack.pop();
			System.out.println("Pop: " + y);
		}
	}
	
	//displaying the element on the top of the stack
	public static void stackPeek(Stack<Integer> stack) {
		Integer element = stack.peek();
		System.out.println("Element on the top of the stack: " + element);
	}
	
	//searching for element in the stack
	public static void stackSearch(Stack<Integer> stack, int element) {
		Integer i = stack.search(element);
		if(i == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element is found at position: " + i);
		}
	}

}
