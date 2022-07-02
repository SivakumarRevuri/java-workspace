
// w a j p to define a method to check the specified element present in the given array or not if it is present , display the first occurrence index

package com.pgpractice.july2array;

import java.util.Scanner;

public class CheckArrayElementPresent {
	
	public static void main(String[] args) {
		CheckArrayElementPresent c= new CheckArrayElementPresent();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of  array");
		int a=s.nextInt();
		int[] m= new int[a];
		System.out.println("enter the array elements ");
		for(int i=0;i<a;i++ ){
		m[i]=s.nextInt();
		}
		c.dispArray(m);
		System.out.println("enter the target element");
		int target=s.nextInt();
		for (int i = 0; i < m.length; i++) {
			if(m[i]==target){
				System.out.println("target element found at position: "+i);
			}else
				System.out.println("target element not found");
		}
		s.close();		
	}
	 int[] dispArray(int[] d) {
		 for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]+"  ");
		}
		 System.out.println();
		return d;
	}
}
