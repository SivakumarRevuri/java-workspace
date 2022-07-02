package com.sivapractice.test;

public class Circle implements Shape {

	double radius;
	public Circle(double r) {
		super();
		this.radius=r;
	}

	@Override
	public double getArea() {
		
		return 3.142*radius*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle r: "+radius;
	}

}
