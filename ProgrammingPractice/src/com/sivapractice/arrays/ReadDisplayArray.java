package com.sivapractice.arrays;

import java.util.Scanner;

public class ReadDisplayArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int N=s.nextInt();

		int[] array=new int[N];
		System.out.println("enter the array elements ");
		for(int i=0;i<N;i++){
			array[i]=s.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		s.close();
	}
}

