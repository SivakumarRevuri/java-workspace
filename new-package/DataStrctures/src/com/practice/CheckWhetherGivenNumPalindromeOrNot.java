package com.practice;
import java.util.Scanner;
import java.util.Stack;

public class CheckWhetherGivenNumPalindromeOrNot {

	public static void main(String[] args) {
		Scanner s= new Scanner( System.in);
		System.out.println("enter the input");
		Stack<Integer> st=new Stack<>();
		int no=s.nextInt();
		int t=no;
		while (no!=0) {
			st.push(no%10);
			no=no/10;
		}
		while (!st.isEmpty()) {
			if (t%10!=st.pop()) {
				System.out.println("not palindrome");
				System.exit(0);
			}
			t=t/10;
		}
		System.out.println("yes palindrome");
		s.close();
	}
}
