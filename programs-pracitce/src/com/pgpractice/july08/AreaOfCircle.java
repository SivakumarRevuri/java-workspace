
// w a j p  to find the area, and perimeter of circle 

package com.pgpractice.july08;

import java.util.Scanner;

public class AreaOfCircle {
	double pi=3.142;

	public static void main(String[] args) {
		System.out.println("enter the radius of circle");
		Scanner s= new Scanner(System.in);
		double r=s.nextDouble();
		AreaOfCircle a= new AreaOfCircle();
		double area= a.pi*r*r;
		double p=2*a.pi*r;
		System.out.println(area);
		System.out.println(p);
		s.close();
		
	}
}
