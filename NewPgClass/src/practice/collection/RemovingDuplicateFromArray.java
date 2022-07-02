package practice.collection;

import java.util.Scanner;

public class RemovingDuplicateFromArray {

	static int duplicateRemoval(int[] a,int n){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
		}
		
		return count-n;
	}
	static void display(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+"  ");
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		display(a);
		System.out.println();
		System.out.println("the no of duplicated elements");
		int k=duplicateRemoval(a, n);
		System.out.println(k);
		s.close();
	}
}
