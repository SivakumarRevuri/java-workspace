package com.practice.spring.jsrannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Bean life cycle depends on InitializingBean and DisposableBean
public class Triangle implements Shape, InitializingBean, DisposableBean {

	public Triangle() {
		System.err.println("I am Triangle Constructor");
	}

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {
		System.out.println("Point [x=" + getPointA().getX() + ", y=" + getPointA().getY() + "]");
		System.out.println("Point [x=" + getPointB().getX() + ", y=" + getPointB().getY() + "]");
		System.out.println("Point [x=" + getPointC().getX() + ", y=" + getPointC().getY() + "]");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am Destroy method, who gets executed before bean destruction ");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am INIt method, who gets execute before bean initialization");

	}

	// JSR Annotation
	@PostConstruct
	public void init() {
		System.out.println("I am custom init method");
	}

	// JSR Annotation
	@PreDestroy
	public void customDestroy() {
		System.out.println("I am custom destroy method");
	}
	/*
	 * Collection Initialization
	 * 
	 * private List<Point> points;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 * 
	 * public void draw() { for (Point point : points) {
	 * System.out.println("Point [x=" + point.getX() + ", y=" + point.getY() + "]");
	 * } }
	 */
}