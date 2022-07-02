package practice.number;

import java.util.Scanner;

public class PalindromeInRange {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the starting number");
		int n1=s.nextInt();
		System.out.println("enter the ending number");
		int n2=s.nextInt();

		palindrome(n1,n2);
		s.close();
	}

	private static void palindrome(int n1, int n2) {

		for (int i = n1; i <=n2; i++) {
			int sum=0,t=i;
			while(t>0){
				int r=t%10;
				sum=sum*10+r;
				t=t/10;
			}
		//	System.out.println("i: "+i);
			if (i==sum) {
				System.out.println(sum);
			}			
		}
	}
}
