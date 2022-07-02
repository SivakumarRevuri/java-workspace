package com.aug01;

public class SmallElement {
	
	static int[] a={11,22,33,44,55};
	static int n=3;
	static int getSmallest(int [] a,int n) {

		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]){
					count++;
				}
				if(count==n-1){
					return a[i];
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println("  smallest number is: "+getSmallest(a, n));
	}
}
