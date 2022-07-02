package com.pgpractice.july2array;

import java.util.Scanner;

public class InterSectionOf2Arrays {

	void intersection(int a[],int b[]){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[i]){
					System.out.println(a[i]);
					break;
				}
				if(a[i]<b[i]){   // when the array is sorted 
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of first array ");
		int m=s.nextInt();
		System.out.println("enter the first array elements");
		int[] a= new int[m];
		for(int i=0;i<m;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the first array elements");
		int[] b= new int[5];
		for(int i=0;i<5;i++){
			b[i]=s.nextInt();
		}
		s.close();
	}
}
