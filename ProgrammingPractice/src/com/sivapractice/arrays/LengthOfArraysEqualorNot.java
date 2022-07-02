package com.sivapractice.arrays;

import java.util.Scanner;

public class LengthOfArraysEqualorNot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int[] a= new int[n];
		System.out.println("enter the first array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int m=s.nextInt();
		int[] b=new int[m];
		System.out.println("enter the second array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		if(a.length==b.length){
			System.out.println("length of the arrays are equal");
		}else
			System.out.println("length of the arrays not equal");
		s.close();
	}
}
