
// w a j p to find the missing element with in 10 in a given array

package com.pgpractice.july2array;

public class MissingElement {
	public static void main(String[] args) {
		int[] a={1,2,4,5,6,7,8,9,10};
		int[] c=new int[11];
		for(int i=0;i<a.length;i++){
			c[a[i]]++;
		}
		for (int j = 0; j < c.length; j++) {
			if(c[j]==0){
				System.out.println("missing elements is: "+j);
			}
		}
	}
}
