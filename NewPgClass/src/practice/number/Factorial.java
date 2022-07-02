package practice;

// w a j p to find the factorial of given number

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the integer number ");
		int x=s.nextInt();
		int f=fact(x);
		System.out.println("the factorial of given number is: "+f);
	}

	private static int fact(int x) {
		int fc=1;
		while(x>1){
			fc=fc*x;
			x--;
		}
		return fc;
	}
}
