package com.practice.array.twodimensional;

public class SumOfDiagonalEle {

	public static void main(String[] args) {
		int a[][]={{1,2,15},{4,5,6},{7,8,9}};
		int pe=0; int se=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==j) {
					pe=pe+a[i][j];
				}
				if ((i+j)==a.length-1) {
					se=se+a[i][j];
				}
			}
		}
		System.out.println("sumof primary diagonal elements is:  "+pe);
		System.out.println("sum of secodary diagonal elements is: "+se);
	}
}
