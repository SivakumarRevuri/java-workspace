
// w a j p to find area and perimeter of rectangle

package com.pgpractice.july08;
import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String[] args) {
		System.out.println("enter the radius of circle");
		Scanner s= new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double area= a*b;
		double p=2*a*b;
		System.out.println(area);
		System.out.println(p);
		s.close();
	}
}
