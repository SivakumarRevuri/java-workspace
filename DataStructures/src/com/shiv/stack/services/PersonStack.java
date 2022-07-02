package com.shiv.stack.services;

import com.shiv.stack.model.Person;

public class PersonStack {

	private int size;
	private Person[] persons;
	private int top;

	public PersonStack() {
		this.size = 30;
		this.persons = new Person[size];
		this.top = -1;
	}

	public PersonStack(int size) {
		this.size = size;
		this.persons = new Person[this.size];
		this.top = -1;
	}

	// to check whether stack full
	public boolean isFull() {
		return (this.top == persons.length - 1);
	}

	// to check empty or not
	public boolean isEmpty() {
		return (this.top == -1);
	}

	// adding element to stack
	public boolean push(Person input) {
		if (!isFull()) {
			top++;
			persons[top] = input;
			return true;
		} else {
			throw new StackOverflowError("Stack is full");
		}
	}
	
	// returns the element by removing
	public Person pop() {
		if (!isEmpty()) {
			return persons[top--];
		}
		return null;
	}
	
	// returns the element with out removal
	public Person peek() {
		if (!isEmpty()) {
			return persons[top];
		}
		return null;
	}

}
