package com.practice.array.twodimensional;
import java.util.Scanner;

public class ReadDisplayMethod {

	static int[][] readArray(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of rows and columns ");
		int m=s.nextInt();
		int n=s.nextInt();

		int[][] a=new int[m][n];
		System.out.println("enter "+m*n+"  elements ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		return a;
	}
	static void  displayArray(int[][] a){ 
		System.out.println("the matrix is ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	static int getBiggest(int[][] a){
		
		int big=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (big<a[i][j]) {
					big=a[i][j];
				}
			}
		}
		return big;
	}
	public static void main(String[] args) {
		int a[][]=readArray();
		displayArray(a);
		int big=getBiggest(a);
		System.out.println("the big element in matrix is: "+big);
	}
}
