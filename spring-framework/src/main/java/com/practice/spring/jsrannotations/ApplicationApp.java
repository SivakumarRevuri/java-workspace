package com.practice.spring.jsrannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.spring.eventHandling.EventPublisher;

public class ApplicationApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = context.getBean("triangle", Triangle.class);
		triangle.draw();
		context.registerShutdownHook();

		System.out.println("====================================");
		// Since Shape is interface, here if you can pass square or triangle
		Shape shape = (Shape) context.getBean("square");
		shape.draw();

		context.getBean(EventPublisher.class).publish();
		context.close();
	}
}
