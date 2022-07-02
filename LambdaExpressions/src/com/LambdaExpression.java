package com;

public class LambdaExpression {

	public static void main(String[] args) {

		// Normal way
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I am inside of Runnable interface");
			}
		});
		thread.run();

		// Using Lambda Expressions

		Thread lambdaThread = new Thread(() -> System.out.println("Hey!!! I am lambda expression"));
		lambdaThread.run();

	}

}
