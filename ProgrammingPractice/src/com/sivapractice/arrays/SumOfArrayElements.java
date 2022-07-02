package com.sivapractice.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the array size ");
		int N=s.nextInt();
		int[] sn=new int[N];
		System.out.println("enter the array elements ");
		for(int i=0;i<N;i++){
			sn[i]=s.nextInt();
		}
		for(int i=0;i<sn.length;i++){
			System.out.print(sn[i]+"  ");
		}		
		System.out.println();
		int sum=0;
		for(int i=0;i<N;i++){
			sum=sum+sn[i];
		}
		System.out.println(" sum of the array elements is "+sum);
		s.close();
	}
}
