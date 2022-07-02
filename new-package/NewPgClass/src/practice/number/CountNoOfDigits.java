package practice.number;

// w a p to count no of digits present in given number

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int c=count(n);
		System.out.println(n+ " consists "+ c+" digits");
		s.close();
	}

	private static int count(int n) {
		int co=0;
		do {
			co++;
			n=n/10;
		} while (n!=0);
		return co;
	}
}
