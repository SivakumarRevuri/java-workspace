package com.practice.formula;

public class Squre implements Shape {

	double d;
	public Squre(double d) {

		this.d=d;
	
	}

	@Override
	public double getArea() {
		
		return d*d;

	}
	@Override
	public String toString() {
		
		
		return "Squre is: "+d*d;
	}

}
