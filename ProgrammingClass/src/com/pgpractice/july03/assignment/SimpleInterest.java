//w a j p to calculate the simple interset


package com.pgpractice.july03.assignment;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the amount");
		int p=s.nextInt();
		System.out.println("rate of interst");
		int r=s.nextInt();
		System.out.println("enter the time period");
		int t=s.nextInt();
		int si=(p*t*r)/100;
		System.out.println("simple interest is "+si);
		s.close();
	}
}
