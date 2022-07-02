package com.practice.array;

public class SmallestNumberInArray {
public static void main(String[] args) {
	int[] a={1,45,6,2,54,0};
/*	if(a[0]<a[1]&&a[0]<a[2]&&a[0]<a[3]){
		System.out.println("smallest number is: "+a[0]);
	}else if(a[1]<a[2] && a[1]<a[3]){
		System.out.println("smallest number is: "+a[1]);
	}else if(a[2]<a[3]){
		System.out.println("smallest number is: " +a[2]);
	}else
		System.out.println("smallest number is: "+a[3]);  */
	int small=a[0];
	
	for (int i = 1; i < a.length; i++) {
		if(small>a[i])
			small=a[i];
		}
	System.out.println(small);
}
}
