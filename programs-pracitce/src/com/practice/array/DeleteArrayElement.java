package com.practice.array;

import java.util.Scanner;

public class DeleteArrayElement {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the size of the array");
	int sz=s.nextInt();
	int[] a=new int[sz];
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
	int[] c=new int[a.length-1];
	System.out.println("enter the position to delete the array element");
	int n=s.nextInt();
	for (int i = 0; i < a.length-1; i++) {
		if(i<n){
			c[i]=a[i];
		}else
			c[i]=a[i+1];
	}
	display(c);
	s.close();
}

private static int[] display(int[] c) {
	int[] s=new int[c.length];
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
	return s;
}
}
