package practice;

// w a j p to find given number is Strong or not 

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		int  res=strong(n);
		boolean strong=isStrong(n,res);
		System.out.println(strong);
	}
	private static boolean isStrong(int n, int res) {
		if (n==res) {
			return true;
		}else
			return false;
	}

	private static int strong(int n) {
		int st=0;
		while (n!=0) {
			int re=n%10;
			st=st+fact(re);
			n=n/10;
		}
		return st;
	}

	private static int fact(int re) {
		int fc=1;
		while (re>0) {
			fc=fc*re;
			re--;
		}
		return fc;
	}	
}
