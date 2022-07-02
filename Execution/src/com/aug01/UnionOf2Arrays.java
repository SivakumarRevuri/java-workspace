package com.aug01;

public class UnionOf2Arrays {

	static void displayArray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		int[] a={1,2,3,5};
		int[] b={2,4,5,6};		
		combine(a,b);
	}

	 static int[] combine (int[]a,int[]b){
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
			removeDup(rs);
			return rs;
		}
	static  int[] removeDup(int a[]) {
			int n=a.length;
			for(int i=0;i<n-1;i++) {
				for (int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						int k=j;
						while(k<n-1) {
							a[k]=a[k+1];
							k++;
						}
						n--;
						j--;
					}
				}
			}
			int rs[]=new int[n];
			for(int i=0; i<n;i++) {
				rs[i]=a[i];
			}
			displayArray(rs);
			return rs;
		}
}
