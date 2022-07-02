package com.pgpractice.july2array;

public class FirstAndSecondSmallest {

	public static void main(String[] args) {
		int[ ] a={0,9,8,7};
		int fbig=a[0];
		int sbig=a[1];
		for(int i=1;i<a.length;i++){
			if(a[i]<fbig){
				sbig=fbig;
				fbig=a[i];
			}else if(a[i]<sbig&&a[i]!=fbig){
				sbig=a[i];
			}
		}
		System.out.println("first small : "+fbig);
		System.out.println("second small: "+sbig);
	}
}
