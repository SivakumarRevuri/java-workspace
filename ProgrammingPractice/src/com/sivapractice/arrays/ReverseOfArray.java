package com.sivapractice.arrays;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array");
		int N=s.nextInt();
		int[] a= new int[N];
		System.out.println("enter the array elements ");
		for(int i=0;i<N;i++)
		a[i]=s.nextInt();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("reverse array is: ");
		for (int i=a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}		
		s.close();
	}
}
