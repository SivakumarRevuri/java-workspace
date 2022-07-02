package com.practice.structural;

public class Circle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("Drawing the Circle with: "+color+" Color");
	}

}
