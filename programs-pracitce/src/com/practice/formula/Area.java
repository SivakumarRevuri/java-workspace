package com.practice.formula;

public class Area {

	public Shape getArea(Shape[] s) {
		Shape sbig=s[0];
		for (int i = 0; i < s.length; i++) {
			sbig=s[i];
		}
		return sbig;
	}
}
