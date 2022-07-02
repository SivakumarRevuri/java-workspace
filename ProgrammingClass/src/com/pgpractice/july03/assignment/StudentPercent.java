//w a j p to display the result of student by considering 5 sub marks , if pass then only display his percentage

package com.pgpractice.july03.assignment;

import java.util.Scanner;

public class StudentPercent {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the subject 1 marks");
		int a=s.nextInt();
		System.out.println("enter the subject 2 marks");
		int b=s.nextInt();
		System.out.println("enter the subject 3 marks");
		int c=s.nextInt();
		System.out.println("enter the subject 4 marks");
		int d=s.nextInt();
		System.out.println("enter the subject 5 marks");
		int e=s.nextInt();
		
		if (a<=100&&b<=100&&c<=100&&d<=100&&e<=100){
		
		if(a>=35&&b>=35&&c>=35&&d>=35&&e>=35){
			double per=(a+b+c+d+e)/5;
			System.out.println("the percentage of student is "+per);
			s.close();
		}else 
			System.out.println("student failed , no percentage");
	}else 
		System.out.println("wrong entry");
	}
	
}