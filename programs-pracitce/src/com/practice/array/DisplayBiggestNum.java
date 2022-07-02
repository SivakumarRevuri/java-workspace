package com.practice.array;

import java.util.Scanner;

public class DisplayBiggestNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of elemets ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the integer values ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int res=biggest(a);
		System.out.println("biggest number is:   "+res);
		s.close();
	}

	private static int biggest(int[] a) {

		int big=a[0];
		for (int i = 0; i < a.length; i++) {
			if(big<a[i])
				big=a[i];
		}
		return big;
	}
}
