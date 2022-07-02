package com.practice.string;
import java.util.Scanner;

public class PanagramOrNot {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the sentece");
		String st= s.nextLine();
		String s1= removeSpace(st);
		if (s1.length()<26) {
			System.out.println("given sentence is not a panagram");
			return;
		}
		String s2=toLower(s1);
		occurance(s2);

	}
	private static String toLower(String s3) {
		char[] ch=s3.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=65&&ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	private static void occurance(String s1) {
		char[] ch=s1.toCharArray();
		int[] c=new int[26];
		for ( int i = 0; i < ch.length; i++) {
			c[s1.charAt(i)-97]++;	
		}	
		for (int i = 0; i < c.length; i++) {
			if(c[i]==0){
				System.out.println("given sentence is not a panagram");
				return;
			}
		}
		System.out.println("given sentence is a panagram");
	}

	private static String removeSpace(String st) {
		char[] ch=st.toCharArray();
		st="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ') 
				st=st+ch[i];
		}
		return st;
	}

}
