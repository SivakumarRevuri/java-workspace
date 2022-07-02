package com.practice.array;

import java.util.Scanner;

public class ReadDisplayArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		System.out.println("enter the array elements");
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("the given array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		s.close();
	}
}