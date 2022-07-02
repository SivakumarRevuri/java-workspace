package com.shiv.stack.services;

public class IntegerStack {

	private int size;
	private int[] values;
	private int top;

	public IntegerStack() {
		this.size = 30;
		this.values = new int[size];
		this.top = -1;
	}

	public IntegerStack(int size) {
		this.size = size;
		this.values = new int[this.size];
		this.top = -1;
	}

	// to check whether stack full
	public boolean isFull() {
		return (this.top == values.length - 1);
	}

	// to check empty or not
	public boolean isEmpty() {
		return (this.top == -1);
	}

	// adding element to stack
	public boolean push(int input) {
		if (!isFull()) {
			top++;
			values[top] = input;
			return true;
		} else {
			throw new StackOverflowError("Stack is full");
		}
	}
	
	// returns the element by removing
	public int pop() {
		if (!isEmpty()) {
			return values[top--];
		}
		return -1;
	}
	
	// returns the element with out removal
	public int peek() {
		if (!isEmpty()) {
			return values[top];
		}
		return -1;
	}

}
