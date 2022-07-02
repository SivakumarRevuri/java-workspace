
// calculate first n product number  or factorial of given number

package queue;

import java.util.Scanner;

public class CalculateProductOfNnaturalNum {


	private static int sumOfN(int n) {
		if (n==1) {
			return 1;
		}
		return (n=n*sumOfN(n-1));
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number you want to calculate");
		int n=s.nextInt();
		int sum=sumOfN(n);
		System.out.println("sum of  "+n+" natural number is:   "+sum);
		s.close();
	}
}
