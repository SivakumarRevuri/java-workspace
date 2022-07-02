package com.shiv.stack.main;

import com.shiv.stack.services.IntegerStack;

public class StackApp {

	public static void main(String[] args) {
		IntegerStack integerStack = new IntegerStack();
		System.out.println("before adding stack: "+integerStack.isFull());
		System.out.println("is stack empty: "+integerStack.isEmpty());
		
		for (int i = 0; i < 30; i++) {
			integerStack.push(i);
		}
		
		System.out.println("after adding stack: "+integerStack.isFull());
		
		// returns the element with out removal
		System.out.println("last element: "+integerStack.peek());
		System.out.println("last second element: "+integerStack.peek());
		
		
		// returns the element by removing the element
		System.out.println("last element: "+integerStack.pop());
		System.out.println("last second element: "+integerStack.pop());
	}
}
