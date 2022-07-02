package com.practice.queue;

public class PrintReverseUsingRecursion {
	
	private static void display(int n) {

		System.out.println(n);
		if (n>1) {
			display(n-1);
		}
	}
	public static void main(String[] args) {
		display(5);
	}
}
