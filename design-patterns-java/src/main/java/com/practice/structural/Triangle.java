package com.practice.structural;

public class Triangle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("Drawing the Triangle with: "+color+" Color");
	}

}
