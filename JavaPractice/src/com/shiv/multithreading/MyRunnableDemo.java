package com.shiv.multithreading;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class MyRunnableDemo {

	public static void main(String[] args) {
		
	}

}
