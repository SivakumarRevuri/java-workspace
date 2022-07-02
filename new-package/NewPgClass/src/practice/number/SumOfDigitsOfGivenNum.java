package practice.number;

// w a j p to find the sum of digits of given number 

import java.util.Scanner;

public class SumOfDigitsOfGivenNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int d=s.nextInt();
		int r=sum(d);
		System.out.println("sum of digits "+d+" is "+r);
		s.close();
	}

	private static int sum(int d) {
		int sum=0;
		while (d>0) {
			int re=d%10;
			sum=sum+re;
			d=d/10;
		}
		return sum;
	}
}
