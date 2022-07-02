package com.practice.array;

public class NthBiggestValue {
	static int[] a={23,45,56,70,15};
	static int n=5;
	static int getBiggest(int [] a,int n) {

		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]){
					count++;
				}
				if(count==n-1){
					return a[i];
				}
				return 0;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println(NthBiggestValue.getBiggest(a, n));
	}
}
