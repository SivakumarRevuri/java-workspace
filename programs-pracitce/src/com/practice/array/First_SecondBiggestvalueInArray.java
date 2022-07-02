package com.practice.array;

public class First_SecondBiggestvalueInArray {
	public static void main(String[] args) {
		int[ ] a={32,535,34,53};
		int fbig=a[0];
		int sbig=a[1];
		for(int i=1;i<a.length;i++){
			if(a[i]>fbig){
				sbig=fbig;
				fbig=a[i];
			}else if(a[i]>sbig&&a[i]!=fbig){
				sbig=a[i];
			}
		}
		System.out.println("first big "+fbig);
		System.out.println("second big: "+sbig);
	}

}
