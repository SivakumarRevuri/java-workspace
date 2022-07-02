package com.aug01;

import java.util.Scanner;

public class DisplayDuplicate {
	static int[]  readArray(int[] a) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		s.close();
		return a;
	}
	static int[] displayArray(int[] a){
		System.out.println("array elements are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		return a;
	}
	public static void main(String[] args) {
		int[] a=new int[5];
		readArray(a);
		displayDuplicate(a);
	}
	

	static void displayDuplicate(int a[]) {
		int n=a.length;
		System.out.println("the duplicate elements are ");
		for(int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					int k=j;
					
					while(k<n-1) {
						a[k]=a[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
		System.out.print(a[i]+"  ");
		}
			
	}

}
