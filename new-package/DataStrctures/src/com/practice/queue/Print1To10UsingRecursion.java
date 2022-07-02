package com.practice.queue;

import java.util.Scanner;

public class Print1To10UsingRecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number upto you want to print");
		disp(s.nextInt());
		s.close();
	}
	private static void disp(int i) {

		if (i>1) {
			disp(i-1);
		}
		System.out.println(i+"  ");
	}
}
