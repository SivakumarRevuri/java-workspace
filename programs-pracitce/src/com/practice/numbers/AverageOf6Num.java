//calculate the average of 6 numbers 


package com.practice.numbers;

import java.util.Scanner;

public class AverageOf6Num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int f=s.nextInt();
		int avg = (a+b+c+d+e+f)/6;
		System.out.println("the average of given number is "+avg);
		s.close();
	}

}
