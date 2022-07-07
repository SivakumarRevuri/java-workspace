package com.practice.multithreading;

public class App {

	public static void main(String[] args) {

		Test t= new Test();
		t.start();
		t.start();

	}
}
