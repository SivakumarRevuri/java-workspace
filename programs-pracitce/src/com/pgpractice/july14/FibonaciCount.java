

// w a   j p to count how many fibonaci number bw 1 to 50

package com.pgpractice.july14;

public class FibonaciCount {
	int  fib(int n){
		int f1=0,f2=1,c=0;
		while(f1<=n){
			c++;
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(c);
		}
		return c;
	}
	public static void main(String[] args) {
		FibonaciCount fc= new FibonaciCount();
		fc.fib(50);
	}

}
