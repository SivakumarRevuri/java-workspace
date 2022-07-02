package com.practice.numbers;

import java.util.Scanner;

public class RangeOfNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first value");
		int L=s.nextInt();
		System.out.println("enter the second value");
		int R=s.nextInt();
		for(int i=L;i<=R;i++){
			System.out.print(i+" ");
		}
		System.out.println();
		s.close();
	}
}
