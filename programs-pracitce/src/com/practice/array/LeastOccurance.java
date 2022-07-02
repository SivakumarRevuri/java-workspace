package com.practice.array;

import java.util.Scanner;

public class LeastOccurance {

	public static void main(String[] args) {
		int[] a={1,2,2,3,4,4,5,};
		Scanner s=  new Scanner(System.in);
		System.out.println("enter the element you want to know how many times it occuraed");
		int n=s.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n){
				count++;
			}
		}
		System.out.println(n+ " occuraed     "+count+ "  times ");
		s.close();
	}
}
