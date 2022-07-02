package com.classby.methoddeclaration;

public class Car {

	public void start() {

		System.out.println("press the start button");

		System.out.println("car started");
	}

	public static void main(String[] args) {
		Car c= new Car();
		c.start();
	}
}
