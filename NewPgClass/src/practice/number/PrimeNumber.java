package practice.number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		if (n==1) {
			System.out.println("prime number start from 2");
			System.exit(0);
		}
		boolean isPrime=true;
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("given num is prime num");
		}else
			System.out.println("is not a prime ");
		s.close();
	}
}
