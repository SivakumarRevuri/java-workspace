package com.aug01;

public class InsertingSpecificIndex {
public static void main(String[] args) {
	int[] a={1,2,3,4,4,6};
	int ele=5;
	int n=4;
	a[n]=ele;
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
