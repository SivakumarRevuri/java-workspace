package com.pgpractice.july14;

public class FibonaciWithLimit {

	void fibmeth(int n){
		int f1=0, f2=1;
		while(n>0){
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;		
		}
	}
	public static void main(String[] args) {
		FibonaciWithLimit f= new FibonaciWithLimit();
		f.fibmeth(50);
	}

}