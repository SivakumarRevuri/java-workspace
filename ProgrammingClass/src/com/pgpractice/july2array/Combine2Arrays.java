package com.pgpractice.july2array;

import java.util.Scanner;

	public class Combine2Arrays {
		
		 static int[] combine(int[]a,int[]b){
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
			System.out.println(rs);
			return rs;
		}
		 int[] dispArray(int[] ar) {
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+"  ");
			}
			return ar;
			
		}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("enter the size of first array");
			int a=s.nextInt();
			System.out.println("enter the size of second array");
			int b=s.nextInt();
			int[] i= new int[a];
			int[] j= new int[b];
			System.out.println("enter the first array elements");
			for (int k = 0; k < i.length; k++) {
				i[k]=s.nextInt();
			}
			System.out.println("enter the second array elements");
			for (int l = 0; l < j.length; l++) {
				j[l]=s.nextInt();
			}			
			Combine2Arrays m= new Combine2Arrays();
			m.dispArray(i);
			m.dispArray(j);
			combine(i, j);
			s.close();
		}
		
	}