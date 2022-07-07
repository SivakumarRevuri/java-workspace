package com.practice.spring.jsrannotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Square implements Shape {

//	@Autowired
//	@Qualifier("squarePoint")
//	using JSR-250 Annotations
	@Resource
	private Point pointA;

	// since @Required is deprecated in favor of Constructor injection
//	public Square(Point point) {
//		System.err.println("I am Square constructor");
//		this.point = point;
//	}

	public void setPoint(Point point) {
		this.pointA = point;
	}

	public Point getPoint() {
		return pointA;
	}

	@Override
	public void draw() {
		System.out.println("Square drawn with x: " + pointA.getX() + " y: " + pointA.getY());
	}

}
