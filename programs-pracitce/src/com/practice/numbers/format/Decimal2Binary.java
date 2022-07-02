package com.practice.numbers.format;

import java.util.Scanner;

public class Decimal2Binary {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the decimal number ");
		int d=s.nextInt(),res=0,t=1;
		while(d!=0){
			int i=d%2;
			res=(i*t)+res;
			d=d/2;
			t=t*10;
		}
		System.out.println(res);
		s.close();
	}	
}


/*  
 * main(){
 * String bin=dec2bin(23);
 * sop(bin);
 * }
 * 
 * static String dec2bin(int number){
 * String temp="";
 * while(number>0){
 * temp=number%2+temp;
 * number =number/2;
 * }
 * return temp;
 * */
