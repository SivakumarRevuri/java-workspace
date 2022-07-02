
// w a j p to print the sum of 2 numbers

package com.pgpractice.july08;

import java.util.Scanner;

public class SumOfTwoNum {
	public static void main(String[] args) {
		System.out.println("enter 2 numbers");

		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		int j=s.nextInt();
		System.out.println("sum of given numbers "+ (i+j));
	}
}
