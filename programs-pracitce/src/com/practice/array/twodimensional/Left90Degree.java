package com.practice.array.twodimensional;

public class Left90Degree {
	private static void displayMat(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("before ");
		displayMat(a);
		System.out.println("after transpose");
		int b[][]=transpose(a);
		displayMat(b);
		System.out.println("after 90 degree ");
		int c[][]=colChange(b);
		displayMat(c);
	}

	private static int[][] colChange(int[][] b) {
		for (int i = 0; i < b.length/2; i++) {
			for (int j = 0; j < b.length; j++) {
				int t=b[i][j];
				b[i][j]=b[b.length-1-i][j];
				b[b.length-1-i][j]=t;
			}
		}
		return b;
	}

	private static int[][] transpose(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		return a;		
	}

}
