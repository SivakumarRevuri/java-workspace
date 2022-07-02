package com.sivapractice.arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] a={22,19,45,765,356,29,888};
		int k=2;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < k; j++) {
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = k+1; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
