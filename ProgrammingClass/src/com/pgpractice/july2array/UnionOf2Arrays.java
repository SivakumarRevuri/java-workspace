package com.pgpractice.july2array;

import java.util.Scanner;

public class UnionOf2Arrays {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of first array ");
		int m=s.nextInt();
		System.out.println("enter the first array elements");
		int[] a= new int[m];
		for(int i=0;i<m;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the second array elements");
		int[] b= new int[5];
		for(int i=0;i<5;i++){
			b[i]=s.nextInt();
		}
		union(a, b);
		s.close();
	}
	static void union(int[] a,int[] b){
		int i=0,j=0;
		while(i<a.length&&j<b.length){
			if(a[i]<b[i]){
				System.out.println(a[i++]+" ");
			}
			else if(a[i]>b[i]){
				System.out.println(b[j++]+" ");
			}else {
				System.out.println(a[i++]+"  ");
				j++;
			}
			while(i<a.length){
				System.out.println(a[i++]+"  ");
			}
			while(j<b.length){
				System.out.println(b[i++]+"  ");
			}
		}
	}
}
