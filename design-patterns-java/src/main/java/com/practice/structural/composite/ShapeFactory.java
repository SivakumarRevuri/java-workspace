package com.practice.structural.composite;

import java.util.ArrayList;
import java.util.List;

import com.practice.structural.Shape;

public class ShapeFactory implements Shape {

	List<Shape> shapeList = new ArrayList<Shape>();

	@Override
	public void draw(String color) {
		for (Shape shape : shapeList) {
			shape.draw(color);
		}
	}

	public void add(Shape shape) {
		this.shapeList.add(shape);
	}

	public void remove(Shape shape) {
		this.shapeList.remove(shape);
	}

	public void clear() {
		this.shapeList.clear();
		System.out.println("The ShapeFactory list has been cleared");
	}
}
