package com.practice.string;
import java.util.Scanner;

public class CountHowManyTimesSubStringPresent {

	public static void main(String[] args) {
		Scanner s= new Scanner( System.in);
		System.out.println("enter the main string");
		String s1=s.nextLine();
		System.out.println("enter the substring");
		String s2=s.nextLine();
		int b=checkstr(s1,s2);
		System.out.println(b);
		s.close();
	}
	private static int checkstr(String s1, String s2) {

		char [] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			int t=i;
			int j=0;
			while (i<ch1.length&&j<ch2.length&&ch1[i]==ch2[j]) {
				i++;
				j++;
			}
			if(j==s2.length()){
				count++;
				i=t;
			}			
		}		
		return count;
	}
}
