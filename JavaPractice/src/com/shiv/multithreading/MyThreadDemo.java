package com.shiv.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}

public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println("main thread demo: " + Thread.currentThread().getName());
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}
