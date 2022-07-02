//  w a j p to print meera if number is divisible by 3, print murali if number is divisible by 5, print murali meets meeera if number is divisible by both

package com.pgpractice.july03;

import java.util.Scanner;

public class DemoOfWeightNumber {
	void meth(int n) {
		if (n%3==0 && n%5==0){
			System.out.println("murali meets meera");
		}
		else  if (n%3==0){
			System.out.println("meera");
		} else if (n%5==0){
			System.out.println("murali");
		}else
			System.out.println("wrong entry");
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int i = s.nextInt();
		DemoOfWeightNumber d= new DemoOfWeightNumber();
		d.meth(i);
		s.close();
	}
}

