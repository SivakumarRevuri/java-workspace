package com.practice.array;

import java.util.Scanner;

public class Add2Arrays {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array ");
		int N=s.nextInt();
		int[] a=new int[N];
		int[] b=new int[N];
		int[] add= new int[N];
		System.out.println("enter the first array elements");
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the second array elements");
		for(int i=0;i<N;i++){
		b[i]=s.nextInt();
		}
		for(int i=0;i<N;i++){
			add[i]=a[i]+b[i];
		}
		for(int i=0;i<N;i++){
			System.out.print(add[i]+"  ");
		}
		System.out.println();
		s.close();
	}
}
