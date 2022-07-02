package com.aug01;

public class Merge2Arrays {
static	int[] merge(int[]a,int[]b){
		int[] rs= new int[a.length+b.length];
		int i=0,j=0;
		while(j<a.length&&j<b.length){
			rs[i]=a[j];
			i++;
			rs[i]=b[j];
			i++;
			j++;			
		}
		while(j<a.length){
			rs[i]=a[j];
			i++;
			j++;
			}
		while(j<b.length){
			rs[i]=a[j];
			i++;
			j++;
			}
		displayArray(rs);
		return rs;
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
		int[] a={1,3,5,7};
		int[] b={2,4,6,8};
		merge(a, b);
	}
}
