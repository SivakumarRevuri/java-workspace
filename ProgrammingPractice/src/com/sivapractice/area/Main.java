package com.sivapractice.area;

public class Main {
	
	public static void main(String[] args) {
		Shape[] s={new Circle(3.4),new Squre(5.6),new Circle(4.5),new Rectangle(2.4, 5.9)};

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]+"--------------->"+s[i].getArea());
		}
		Area a= new Area();
		Shape big=a.getArea(s);
		System.out.println("biggest area size is ");
		
		System.out.println(big.getArea());
	
	
	}
}
