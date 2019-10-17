package com.example.stacks;

	import java.util.Stack;

	public class StackExample {

	    public static void main(String[] args) {
	        //Stack extends from Vector, so the stack belongs to the Collection framework
	         
	        Stack<Integer> stack = new Stack<Integer>();
	        stackPush(stack);
	        //stackPop(stack);
	        stackPeek(stack);
	        stackSearch(stack, 2);
	        System.out.println(stack);
	    }

	    //pushing elements on top of the stack
	    public static void stackPush(Stack<Integer> stack) {
	        for (int i=0; i<5; i++) {
	            stack.push(i);
	        }
	        System.out.println(stack);
	    }
	    
	    //popping element from top of stack
	    public static void stackPop(Stack<Integer> stack) {
	        for (int i=0; i<5; i++) {
	            Integer y = stack.pop();
	            System.out.println("Pop " + y);
	        }
	    }
	    
	    //displaying the elements on top of the stack
	    public static void stackPeek(Stack<Integer> stack) {
	        Integer element = stack.peek();
	        System.out.println("Element on the top of the stack: " + element);
	    }
	    
	    //searching for an element in our stack
	    public static void stackSearch(Stack<Integer> stack, int element) {
	        Integer i = stack.search(element);
	        
	        if (i == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("element found at position: " + i);
	        }
	    }
	}

	

















