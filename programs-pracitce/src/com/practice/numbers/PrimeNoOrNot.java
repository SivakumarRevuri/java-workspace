package com.practice.numbers;

import java.util.Scanner;

public class PrimeNoOrNot {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the input");
		int n=s.nextInt();
		boolean b=isPrime(n);
		if (b) {
			System.out.println(n+"  is a prime number");
		}else
			System.out.println(n+" is not a prime number");
		s.close();
	}

	private static boolean isPrime(int n) {

		int i=2;
		while(i<=n/2){
			if (n%i==0) 								
				return false;
				i++;			
		}
		return true;
	}
}
