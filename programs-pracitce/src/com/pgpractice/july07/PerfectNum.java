
// print the perfect number between 1 to 1000

package com.pgpractice.july07;

public class PerfectNum {
	static boolean isPerfect(int n){
		int sum=0,i=1;
		while(i<n/2){
			if(n%i==0){
				sum=sum+i;
				i++;
				}			
		}
		return i==sum;
	}
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++){
			if(isPerfect(i)){
				System.out.println(i+" is perfect number");				
			}
		}
	}

}
