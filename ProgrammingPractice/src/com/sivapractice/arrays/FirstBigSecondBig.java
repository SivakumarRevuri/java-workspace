package com.sivapractice.arrays;

import java.util.Scanner;
public class FirstBigSecondBig {

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
		System.out.println("second  biggest  is:   "+res);
		s.close();
	}
	private static int biggest(int[] a) {
		int fbig=a[0];
		int sbig=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fbig) {
				sbig = fbig;
				fbig = a[i];

			} else if (a[i] > sbig) {
				sbig = a[i];
			}
		}
		System.out.println("first big:   "+fbig);
		return sbig;
	}
}
