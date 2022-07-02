package com.sivapractice.arrays;

import java.util.Scanner;

public class SearchingArrayElement {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] a= new int[4];
		System.out.println("enter the array elements");
		for(int i=0;i<4;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the target element ");
		int target=s.nextInt();
		for(int i=0;i<4;i++){
			if(a[i]==target){
				System.out.println("target element found at index: "+i);
				break;
			}
			s.close();
		}
	}
}
