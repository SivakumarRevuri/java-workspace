package com.practice.formula;

public class Rectangle implements Shape {

	double length;
	double breadth;
	public Rectangle(double i, double j) {
		
		this.length=i;
		this.breadth=j;
	}

	@Override
	public double getArea() {
		
		
		return length*breadth;		
	}
	@Override
	public String toString() {
		return "Rectangle area "+(length*breadth);
	}

}
