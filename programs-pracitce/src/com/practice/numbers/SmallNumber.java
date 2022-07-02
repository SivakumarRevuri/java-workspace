
//w a j p to display smallest among 3 number

package com.practice.numbers;

import java.util.Scanner;

public class SmallNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the i value");
		int i=s.nextInt();
		System.out.println("enter the j value");
		int j=s.nextInt();
		System.out.println("enter the k value");
		int k=s.nextInt();
		if (i<=j&&i<=k){
			System.out.println("small number is " +i);
		}else if (j<=k){
			System.out.println("small number is "+j);
		}else
			System.out.println("small number is "+k);
		s.close();
	}
}
