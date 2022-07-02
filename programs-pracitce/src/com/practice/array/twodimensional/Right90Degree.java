package com.practice.array.twodimensional;

public class Right90Degree {
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
		System.out.println("after 90 degree  right");
		int c[][]=rowChange(b);
		displayMat(c);
	}

	private static int[][] rowChange(int[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length/2; j++) {
				int t=b[i][j];
				b[i][j]=b[i][b.length-1-j];
				b[i][b.length-1-j]=t;
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
