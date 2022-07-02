package com.pgpractice.july2array;

import java.util.Scanner;

public class Test {
	int[] Aoperation(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int ele[]= new int [n];
		System.out.println("enter the "+n+"elements");
		for (int i = 0; i < ele.length; i++) {
			ele[i]=s.nextInt(n);
		}
		return ele;
	}
}
