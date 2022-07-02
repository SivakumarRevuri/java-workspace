package com.aug01;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		readArray(a);
		reverseArray(a);
		s.close();
	}

	private static void reverseArray(int[] a) {
		int[] res=new int[a.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=a[i];
				
		}
		System.out.println("reverse of the given array elements is: ");
		for (int i = res.length-1; i >=0; i--) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
	}

	private static void readArray(int[] a) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		s.close();
	}
}
