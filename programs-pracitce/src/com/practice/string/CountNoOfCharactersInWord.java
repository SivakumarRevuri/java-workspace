package com.practice.string;
import java.util.Scanner;

public class CountNoOfCharactersInWord {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=s.nextLine();
		char[] ch=st.toCharArray();
		int wc=1;
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			String ws="";
			while(i<ch.length&&ch[i]!=' '){
				count++;
				ws=ws+ch[i];
				i++;
			}
			if (count>0) {
				System.out.println(ws+" has "+count+ "  of characters");
				wc++;
			}
		}
	}
}
