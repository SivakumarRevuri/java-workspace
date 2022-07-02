package com.practice.array;

import java.util.Scanner;

public class ZigZag {
	public static void main(String[] args) {
		int[] a=readArray();
		int[] b=readArray();
		int[] c=zigZag(a,b);
		display(a);
		display(b);
		display(c);
	}

	  static void display(int[] c) {
		  for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"  ");
		}
		  System.out.println();
	}

	static int[] zigZag(int[] a,int[] b) {
		 int[] res=new int[a.length+b.length];
		 int i=0,j=0;
		 while(j<a.length&&j<b.length){
			 res[i]=a[j];
			 i++;
			 res[i]=b[j];
			 i++;
			 j++;
		 }
		 while(j<a.length){
			 res[i]=a[j];
			 i++;
			 j++;
		 }
		 while(j<b.length){
			 res[i]=b[j];
			 i++;
			 j++;
		 }
		 
		 return res;
	}

	static int[] readArray() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		return a;
	}

}
