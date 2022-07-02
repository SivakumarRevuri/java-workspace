package readdisplay;

import java.util.Scanner;

public class ReadingFromUser {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of rows and columns ");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		System.out.println("enter "+m*n+"  elements ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the matrix elements are ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
