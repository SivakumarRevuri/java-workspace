// w a  j p to find the avg of 3 numbers

package com.pgpractice.july08;

import java.util.Scanner;

public class AvgOf3Num {

	static void meth() {
		System.out.println("enter 3 numbers");
		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		int j=s.nextInt();
		int k= s.nextInt();
		System.out.println((i+j+k)/3);
	}
	public static void main(String[] args) {
		AvgOf3Num a= new AvgOf3Num();

		a.meth();
	}
}
