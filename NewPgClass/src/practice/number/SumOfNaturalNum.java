package practice;


// w a j p to find of SumOfNatural numbers

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the integer number ");
		int x=s.nextInt();
		int f=fact(x);
		System.out.println("the sum of given number is: "+f);
		s.close();
	}

	private static int fact(int x) {
		int fc=0;
		while(x>=1){
			fc=fc+x;
			x--;
		}
		return fc;
	}
}
